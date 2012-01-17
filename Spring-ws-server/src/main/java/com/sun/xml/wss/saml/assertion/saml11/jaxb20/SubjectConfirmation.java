/*
 * $Id: SubjectConfirmation.java,v 1.9 2008-07-03 05:29:12 ofung Exp $
 */

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

package com.sun.xml.wss.saml.assertion.saml11.jaxb20;

import com.sun.xml.wss.saml.SAMLException;
import com.sun.xml.wss.logging.LogDomainConstants;
import com.sun.xml.security.core.dsig.KeyInfoType;
import com.sun.xml.wss.saml.NameID;
import com.sun.xml.wss.saml.SubjectConfirmationData;
import com.sun.xml.wss.saml.internal.saml11.jaxb20.SubjectConfirmationType;
import com.sun.xml.wss.saml.util.SAMLJAXBUtil;
import java.util.LinkedList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import org.w3c.dom.Element;
import java.util.logging.Logger;

import java.security.PublicKey;

import javax.xml.bind.JAXBContext;

/**
 * The <code>SubjectConfirmation</code> element specifies a subject by specifying data that
 * authenticates the subject.
 */
public class SubjectConfirmation extends com.sun.xml.wss.saml.internal.saml11.jaxb20.SubjectConfirmationType
        implements com.sun.xml.wss.saml.SubjectConfirmation {
    
    protected PublicKey keyInfoKeyValue = null;    
            
    protected static final Logger log = Logger.getLogger(
            LogDomainConstants.WSS_API_DOMAIN,
            LogDomainConstants.WSS_API_DOMAIN_BUNDLE);
    
    public SubjectConfirmation(){
        
    }
    
    public void setConfirmationMethod(List confirmationMethod) {
        this.confirmationMethod = confirmationMethod;
    }
    
    /**
     * From scratch constructor for a single confirmation method.
     *
     * @param confirmationMethod A URI (String) that identifies a protocol used
     *        to authenticate a <code>Subject</code>. Please refer to
     *        <code>draft-sstc-core-25</code> Section 7 for a list of URIs
     *        identifying common authentication protocols.
     * @exception SAMLException if the input data is null.
     */
    public SubjectConfirmation(java.lang.String confirmationMethod) {
        
        List cm = new LinkedList();
        cm.add(confirmationMethod);
        setConfirmationMethod(cm);
    }
    
    /**
     * Constructs a subject confirmation element from an existing
     * XML block.
     *
     * @param subjectConfirmationElement a DOM Element representing the
     *        <code>SubjectConfirmation</code> object.
     * @throws SAMLException
     */
    public static SubjectConfirmationType fromElement(org.w3c.dom.Element element)
    throws SAMLException {
        try {
            JAXBContext jc = SAMLJAXBUtil.getJAXBContext();
                    
            javax.xml.bind.Unmarshaller u = jc.createUnmarshaller();
            return (SubjectConfirmationType)u.unmarshal(element);
        } catch ( Exception ex) {
            throw new SAMLException(ex.getMessage());
        }
    }
    
    /**
     * Constructs an <code>SubjectConfirmation</code> instance.
     *
     * @param confirmationMethods A set of <code>confirmationMethods</code>
     *        each of which is a URI (String) that identifies a protocol
     *        used to authenticate a <code>Subject</code>. Please refer to
     *        <code>draft-sstc-core-25</code> Section 7 for
     *        a list of URIs identifying common authentication protocols.
     * @param subjectConfirmationData Additional authentication information to
     *        be used by a specific authentication protocol. Can be passed as
     *        null if there is no <code>subjectConfirmationData</code> for the
     *        <code>SubjectConfirmation</code> object.
     * @param keyInfo An XML signature element that specifies a cryptographic
     *        key held by the <code>Subject</code>.
     * @exception SAMLException if the input data is invalid or
     *            <code>confirmationMethods</code> is empty.
     */
    public SubjectConfirmation(
            List confirmationMethods, Element subjectConfirmationData,
            Element keyInfo) throws SAMLException {
        
        JAXBContext jc = null;
        javax.xml.bind.Unmarshaller u = null;
        
        //Unmarshal to JAXB KeyInfo Object and set it
        try {
            jc = SAMLJAXBUtil.getJAXBContext();;
            u = jc.createUnmarshaller();
        } catch ( Exception ex) {
            throw new SAMLException(ex.getMessage());
        }
        
        try {
            if ( keyInfo != null) {
                setKeyInfo((KeyInfoType)((JAXBElement)u.unmarshal(keyInfo)).getValue());
            }
            if ( subjectConfirmationData != null) {
                setSubjectConfirmationData((SubjectConfirmationType)((JAXBElement)u.unmarshal(subjectConfirmationData)).getValue());
            }
        } catch (Exception ex) {
            // log here
            throw new SAMLException(ex);
        }
        setConfirmationMethod(confirmationMethods);
    }     
    
    public SubjectConfirmation(SubjectConfirmationType subConfType){      
        setSubjectConfirmationData(subConfType.getSubjectConfirmationData());        
        setConfirmationMethod(subConfType.getConfirmationMethod());
    }
       
    public Object getSubjectConfirmationDataForSAML11() {
        return super.getSubjectConfirmationData();
    }
    
    public SubjectConfirmationData getSubjectConfirmationDataForSAML20() {
        throw new UnsupportedOperationException("Not supported for SAML 1.1");
    }

    public NameID getNameId() {
        throw new UnsupportedOperationException("Not supported for SAML 1.1");
    }
    
}