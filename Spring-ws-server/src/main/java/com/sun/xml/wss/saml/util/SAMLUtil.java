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


package com.sun.xml.wss.saml.util;


import com.sun.xml.stream.buffer.MutableXMLStreamBuffer;
import com.sun.xml.stream.buffer.stax.StreamWriterBufferCreator;
import com.sun.xml.wss.impl.SecurableSoapMessage;
import com.sun.xml.wss.logging.LogDomainConstants;
import com.sun.xml.wss.XWSSecurityException;
import com.sun.xml.wss.impl.MessageConstants;
import java.text.ParseException;
import java.util.Date;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.dom.DOMResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.bind.JAXBContext;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;
import com.sun.xml.wss.util.DateUtils;

public class SAMLUtil {
    private static Logger logger = Logger.getLogger(LogDomainConstants.SAML_API_DOMAIN,
            LogDomainConstants.SAML_API_DOMAIN_BUNDLE);
    
    
    public static Element locateSamlAssertion(String assertionId,Document soapDocument)
    throws XWSSecurityException {
        
        //System.out.println("\n\n--------SOAP DOCUMENT : " + soapDocument + "--------\n\n");
        
        NodeList nodeList = null;
        
//        try {
          nodeList = soapDocument.getElementsByTagNameNS(MessageConstants.SAML_v1_0_NS, MessageConstants.SAML_ASSERTION_LNAME);
          if((nodeList.item(0)) == null ){
              nodeList = soapDocument.getElementsByTagNameNS(MessageConstants.SAML_v2_0_NS,
                    MessageConstants.SAML_ASSERTION_LNAME);
          }
        
        int nodeListLength = nodeList.getLength();
        if (nodeListLength == 0) {
                logger.log(Level.SEVERE,"WSS001.SAML_ASSERTION_NOT_FOUND",new Object[] {assertionId});
            throw SecurableSoapMessage.newSOAPFaultException(
                    MessageConstants.WSSE_SECURITY_TOKEN_UNAVAILABLE,
                    "Referenced Security Token could not be retrieved",
                    null);
            //throw new XWSSecurityException(
            //"No SAML Assertion found with  AssertionID:" + assertionId );
        }
        
        for (int i=0; i<nodeListLength; i++) {
            Element assertion = (Element) nodeList.item(i);
            String  aId = assertion.getAttribute(MessageConstants.SAML_ASSERTIONID_LNAME);
            String id = assertion.getAttribute(MessageConstants.SAML_ID_LNAME);
            if (aId.equals(assertionId) || id.equals(assertionId)) {
                //return  XMLUtil.convertToSoapElement(soapDocument, assertion);
                return assertion;
            }
        }
            logger.log(Level.SEVERE,"WSS001.SAML_ASSERTION_NOT_FOUND",new Object[] {assertionId});
        throw SecurableSoapMessage.newSOAPFaultException(
                MessageConstants.WSSE_SECURITY_TOKEN_UNAVAILABLE,
                "Referenced Security Token could not be retrieved",
                null);
        //throw new XWSSecurityException("Could not locate SAML assertion with AssertionId:" + assertionId);
    }
    
    public static Element toElement(Node doc, Object element) throws XWSSecurityException{
        
        DOMResult result = null;
        Document document = null;
        //TODO : If DOC is SUPPLIED then this code is not working
        if ( doc != null) {
            
            result = new DOMResult(doc);
        } else {
            
            try {
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                document = builder.newDocument();
            } catch (Exception ex) {
                logger.log(Level.SEVERE, "WSS002.failed.create.document", ex);
                throw new XWSSecurityException("Unable to create Document : " + ex.getMessage());
            }
            result = new DOMResult(document);
        }
        
        try {
            JAXBContext jc = null;
            
            if (System.getProperty("com.sun.xml.wss.saml.binding.jaxb") == null ){
                if (element instanceof com.sun.xml.wss.saml.assertion.saml20.jaxb20.Assertion){
                    jc = SAML20JAXBUtil.getJAXBContext() ;      
                }else {                    
                    jc = SAMLJAXBUtil.getJAXBContext();                    
                }
            } else {                
                jc = SAMLJAXBUtil.getJAXBContext();                
            }
            Marshaller m = jc.createMarshaller();
            
            if (element == null){
                if (logger.isLoggable(Level.FINE)) {
                    logger.log(Level.FINE,"Element is Null in SAMLUtil.toElement()");
                }
            }
            
            m.setProperty("com.sun.xml.bind.namespacePrefixMapper", new WSSNamespacePrefixMapper());
            m.marshal(element, result);            
            
        } catch (Exception ex) {
            logger.log(Level.SEVERE,"WSS003.failedto.marshal", ex);
            throw new XWSSecurityException("Not able to Marshal " + element.getClass().getName() + 
                ", got exception: " + ex.getMessage());
        }
        
        if ( doc != null) {
            //return ((Document)doc).getDocumentElement();
            
            
            if (doc.getNodeType() == Node.ELEMENT_NODE) {
                if (doc.getFirstChild().getNamespaceURI().equals(MessageConstants.SAML_v2_0_NS)){
                    Element el = (Element)((Element)doc).getElementsByTagNameNS(MessageConstants.SAML_v2_0_NS, "Assertion").item(0);
                    return el;
                }else{
                    Element el = (Element)((Element)doc).getElementsByTagNameNS(MessageConstants.SAML_v1_0_NS, "Assertion").item(0);
                    return el;
                }
            } else {
                if (doc.getFirstChild().getNamespaceURI().equals(MessageConstants.SAML_v2_0_NS)){
                    Element el = (Element)((Document)doc).getElementsByTagNameNS(MessageConstants.SAML_v2_0_NS,"Assertion").item(0);
                    return el;
                }else{
                    Element el = (Element)((Document)doc).getElementsByTagNameNS(MessageConstants.SAML_v1_0_NS,"Assertion").item(0);
                    return el;
                }
            }
            
        } else {
            if (document.getFirstChild().getNamespaceURI().equals(MessageConstants.SAML_v2_0_NS)){
                Element el = (Element)document.getElementsByTagNameNS(MessageConstants.SAML_v2_0_NS, "Assertion").item(0);
                return el;            
            }else{
                Element el = (Element)document.getElementsByTagNameNS(MessageConstants.SAML_v1_0_NS, "Assertion").item(0);
                return el;            
            }
        }
    }
    
    public static Element createSAMLAssertion(XMLStreamReader reader) throws XWSSecurityException,XMLStreamException{
        XMLOutputFactory xof = XMLOutputFactory.newInstance();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();        
        MutableXMLStreamBuffer buffer = new MutableXMLStreamBuffer();
        StreamWriterBufferCreator bCreator = new StreamWriterBufferCreator(buffer);
        Document doc = null;        
        try{                                
            XMLStreamWriter writer = xof.createXMLStreamWriter(baos);
            XMLStreamWriter writer_tmp = (XMLStreamWriter)bCreator;
            while(!(XMLStreamReader.END_DOCUMENT == reader.getEventType())){
                com.sun.xml.ws.security.opt.impl.util.StreamUtil.writeCurrentEvent(reader, writer_tmp);
                reader.next();
            }
            buffer.writeToXMLStreamWriter(writer);
            writer.close();
            try {
                baos.close();
            } catch (IOException ex) {
                throw new XWSSecurityException("Error occurred while trying to convert SAMLAssertion stream into DOM Element", ex);
            }
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setNamespaceAware(true);
            DocumentBuilder db = dbf.newDocumentBuilder();            
            doc = db.parse(new ByteArrayInputStream(baos.toByteArray()));
            return  doc.getDocumentElement();    
        } catch(XMLStreamException xe){
            throw new XMLStreamException("Error occurred while trying to convert SAMLAssertion stream into DOM Element", xe);
        }catch(Exception xe){
            throw new XWSSecurityException("Error occurred while trying to convert SAMLAssertion stream into DOM Element", xe);
        }
    }
    
    public static boolean validateTimeInConditionsStatement(Element samlAssertion) throws XWSSecurityException {
     
        Date _notBefore=null;
        Date  _notOnOrAfter=null;
        
        NodeList nl = samlAssertion.getElementsByTagNameNS(samlAssertion.getNamespaceURI(), "Conditions");
        Node conditionsElement = null;
        if (nl != null && nl.getLength() > 0) {
            conditionsElement = nl.item(0);
        } else {
            //no conditions stmt
            logger.log(Level.INFO, "No Conditions Element found in SAML Assertion");
            return true;
        }
        Element elt = (Element)conditionsElement;
        String eltName = elt.getLocalName();
        if (eltName == null)  {
            throw new XWSSecurityException("Internal Error: LocalName of Conditions Element found Null") ;
        }
        if (!(eltName.equals("Conditions")))  {
            throw new XWSSecurityException("Internal Error: LocalName of Conditions Element found to be :" + eltName) ;
        }
        
        String dt = elt.getAttribute("NotBefore");
        if ((dt != null) && (!dt.equals("")))  {
            try {
                _notBefore = DateUtils.stringToDate(dt);
            } catch (ParseException pe) {
               throw new XWSSecurityException(pe);
            }
                                                                                                                                                             
        }
        dt = elt.getAttribute("NotOnOrAfter");
        if ((dt != null) && (!dt.equals("")))  {
            try {
                _notOnOrAfter = DateUtils.stringToDate(
                            elt.getAttribute("NotOnOrAfter"));
            } catch (ParseException pe) {
               throw new XWSSecurityException(pe);
            }
        }
        
        long someTime = System.currentTimeMillis();
        
        if (_notBefore == null ) {
            if (_notOnOrAfter == null) {
                return true;
            } else {
                if (someTime < _notOnOrAfter.getTime()) {
                    return true;
                }
            }
        } else if (_notOnOrAfter == null ) {
            if (someTime >= _notBefore.getTime()) {
                return true;
            }
        } else if ((someTime >= _notBefore.getTime()) &&
            (someTime < _notOnOrAfter.getTime()))
        {
            return true;
        }
        return false;
    }
}
