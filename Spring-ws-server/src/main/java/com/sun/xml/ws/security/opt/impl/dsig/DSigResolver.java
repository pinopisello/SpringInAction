/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
 * Copyright 1997-2008 Sun Microsystems, Inc. All rights reserved.
 * 
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License. You can obtain
 * a copy of the License at https://glassfish.dev.java.net/public/CDDL+GPL.html
 * or glassfish/bootstrap/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at glassfish/bootstrap/legal/LICENSE.txt.
 * Sun designates this particular file as subject to the "Classpath" exception
 * as provided by Sun in the GPL Version 2 section of the License file that
 * accompanied this code.  If applicable, add the following below the License
 * Header, with the fields enclosed by brackets [] replaced by your own
 * identifying information: "Portions Copyrighted [year]
 * [name of copyright owner]"
 * 
 * Contributor(s):
 * 
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

package com.sun.xml.ws.security.opt.impl.dsig;

import com.sun.xml.ws.api.message.Attachment;
import com.sun.xml.ws.security.opt.api.SecurityElement;
import com.sun.xml.ws.security.opt.api.SecurityHeaderElement;
import com.sun.xml.ws.security.opt.impl.crypto.SSBData;
import com.sun.xml.ws.security.opt.impl.message.SOAPBody;
import com.sun.xml.ws.security.opt.impl.message.SecuredMessage;
import java.util.ArrayList;
import javax.xml.crypto.Data;
import javax.xml.crypto.URIDereferencer;
import javax.xml.crypto.URIReference;
import javax.xml.crypto.URIReferenceException;
import javax.xml.crypto.XMLCryptoContext;
import com.sun.xml.ws.security.opt.crypto.JAXBData;

import javax.xml.stream.XMLStreamException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.HashMap;
import com.sun.xml.ws.security.opt.impl.crypto.JAXBDataImpl;
import com.sun.xml.wss.impl.MessageConstants;
import com.sun.xml.ws.security.opt.impl.JAXBFilterProcessingContext;
import com.sun.xml.wss.logging.LogDomainConstants;
import com.sun.xml.wss.logging.impl.opt.signature.LogStringsMessages;
import com.sun.xml.ws.security.opt.impl.util.JAXBUtil;
import com.sun.xml.ws.security.opt.impl.outgoing.SecurityHeader;
import com.sun.xml.wss.XWSSecurityException;
import com.sun.xml.ws.api.message.Header;
import com.sun.xml.ws.security.opt.impl.crypto.AttachmentData;

/**
 * Implementation of JSR 105 URIDereferencer interface for optimized path
 *
 * @author Ashutosh.Shahi@Sun.com
 */

public class DSigResolver implements URIDereferencer{
    
    private static DSigResolver resolver = new DSigResolver();
    private static final Logger logger = Logger.getLogger(LogDomainConstants.IMPL_OPT_SIGNATURE_DOMAIN,
            LogDomainConstants.IMPL_OPT_SIGNATURE_DOMAIN_BUNDLE);
    
    /**
     *
     * create a new instance of this class
     * @return URI Dereferencer instance.
     */
    
    public static URIDereferencer getInstance(){
        return resolver;
    }
    
    
    /**
     * resolve the URI of type "cid:" , "attachmentRef:", "http:", "#xyz".
     * @param uriRef {@inheritDoc}
     * @param context{@inheritDoc}
     * @throws URIReferenceException {@inheritDoc}
     * @return {@inheritDoc}
     */
    
    public Data dereference(final URIReference uriRef, final XMLCryptoContext context) throws URIReferenceException {
        String uri = null;
        uri = uriRef.getURI();
        if(logger.isLoggable(Level.FINEST)){
            logger.log(Level.FINEST, LogStringsMessages.WSS_1750_URI_TOBE_DEREFERENCED(uri));
        }
        return dereferenceURI(uri, context);
    }
    
    private Data dereferenceURI(final String uri, final XMLCryptoContext context) throws URIReferenceException{
        try{
            
            if(uri == null || uri.equals("")){
                throw new UnsupportedOperationException("Empty Reference URI not supported");
            } else if(uri.charAt(0) == '#'){
                return dereferenceFragment(getIdFromFragmentRef(uri), context);
            } else if(uri.startsWith("cid:") || uri.startsWith("attachmentRef:")){
                //throw new UnsupportedOperationException("Not supported in optimized path");
                return dereferenceAttachments(uri, context);
            } else if(uri.startsWith("http")){
                throw new UnsupportedOperationException("Not supported in optimized path");
            } else {
                return dereferenceFragment(uri, context);
            }
        } catch(Exception e){
            throw new URIReferenceException(e);
        }
    }
    
    Data dereferenceAttachments(final String uri, final XMLCryptoContext context) throws URIReferenceException{
        JAXBFilterProcessingContext filterContext = (JAXBFilterProcessingContext) context.get(MessageConstants.WSS_PROCESSING_CONTEXT);
        SecuredMessage secureMsg = filterContext.getSecuredMessage();
        Attachment attachment = secureMsg.getAttachment(uri);
        if(attachment == null){
            throw new URIReferenceException ("Attachment Resource with Identifier  "+uri+" was not found");
        }
        AttachmentData attachData = new AttachmentData(attachment);
        return attachData;
    }
    
    Data dereferenceFragment(final String uri, final XMLCryptoContext context) throws XWSSecurityException{
        JAXBFilterProcessingContext filterContext = (JAXBFilterProcessingContext) context.get(MessageConstants.WSS_PROCESSING_CONTEXT);
        HashMap elementCache = filterContext.getElementCache();
        try{
            if(elementCache.size() > 0){
                Object obj = elementCache.get(uri);
                if(obj != null && obj instanceof Header){
                    Header reqdHeader = (Header)obj;
                    JAXBContext jaxbContext = JAXBUtil.getJAXBContext();
                    JAXBElement jb = reqdHeader.readAsJAXB(jaxbContext.createUnmarshaller());
                    JAXBData jData = new JAXBDataImpl(jb, jaxbContext, filterContext.getNamespaceContext());
                    return jData;
                }
            }
            
            return getDataById(filterContext, uri);
        } catch(JAXBException jbe){
            throw new XWSSecurityException(jbe);
        } catch(XMLStreamException sxe){
            throw new XWSSecurityException(sxe);
        }
    }
    
    
    private static String getIdFromFragmentRef(final String ref) {
        char start = ref.charAt(0);
        if (start == '#') {
            return ref.substring(1);
        }
        return ref;
    }
    
    
    
    private Data getDataById(final JAXBFilterProcessingContext context,
            final String uri) throws JAXBException, XMLStreamException,
            XWSSecurityException{
        SecuredMessage secMessage = context.getSecuredMessage();
        ArrayList headerList = secMessage.getHeaders();
        // Look for Id or wsu:Id attribute in all elements
        SecurityHeaderElement reqdHeader = null;
        for(int i = 0; i < headerList.size(); i++){
            Object header = headerList.get(i);
            if(header instanceof SecurityHeaderElement){
                // header already wrapped by a SecurityheaderElement
                SecurityHeaderElement she = (SecurityHeaderElement)header;
                if(uri.equals(she.getId())){
                    reqdHeader = she;
                    break;
                }
            }
        }
        
        // check inside the Securityheader
        if(reqdHeader == null){
            SecurityHeader secHeader = context.getSecurityHeader();
            SecurityHeaderElement she = secHeader.getChildElement(uri);
            if(she != null && !(she.getLocalPart() == MessageConstants.WSSE_SECURITY_TOKEN_REFERENCE_LNAME &&
                    she.getNamespaceURI() == MessageConstants.WSSE_NS)){
                reqdHeader = she;
            }
        }
        
        // if matches, convert the element to JAXBData
        if(reqdHeader != null){
            // how to get contentOnly???
            return new JAXBDataImpl(reqdHeader, context.getNamespaceContext(),false);
        } else{
            try {
                Object body = secMessage.getBody();
                if(body instanceof SecurityElement){
                    SecurityElement se = (SecurityElement)body;
                    if(uri.equals(se.getId())){
                        return new JAXBDataImpl(se, context.getNamespaceContext(),false);
                    }
                } else if(body instanceof SOAPBody){
                    SOAPBody soapBody = (SOAPBody)body;
                    if(uri.equals(soapBody.getId())){
                        return new SSBData(soapBody, false, context.getNamespaceContext());
                        //write to streamwriter data and return
                    }else if(uri.equals(soapBody.getBodyContentId())){
                        return new SSBData(soapBody, true, context.getNamespaceContext());
                    }
                }
            } catch (XWSSecurityException ex) {
                logger.log(Level.SEVERE, LogStringsMessages.WSS_1704_ERROR_RESOLVING_ID(uri));
                throw new XWSSecurityException(ex);
            }
        }
        Data data = null;
        data = (Data)context.getElementCache().get(uri);
        return data;
    }
    
}



