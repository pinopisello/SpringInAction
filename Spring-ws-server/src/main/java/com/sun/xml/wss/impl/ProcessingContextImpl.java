/*
 * $Id: ProcessingContextImpl.java,v 1.17 2008-07-03 05:28:51 ofung Exp $
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

package com.sun.xml.wss.impl;

import com.sun.xml.ws.security.IssuedTokenContext;
import com.sun.xml.ws.security.impl.kerberos.KerberosContext;
import java.util.Map;
import java.util.Hashtable;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import javax.xml.soap.SOAPMessage;

import com.sun.xml.wss.ProcessingContext;
import com.sun.xml.wss.XWSSecurityException;

import com.sun.xml.wss.impl.policy.SecurityPolicy;
import com.sun.xml.wss.impl.policy.StaticPolicyContext;
import com.sun.xml.wss.impl.policy.mls.MessagePolicy;

import org.w3c.dom.Element;

public class ProcessingContextImpl extends ProcessingContext {
    
    protected WSSAssertion wssAssertion = null;

    protected Hashtable issuedTokenContextMap = null;
    
    protected Hashtable scPolicyIDtoSctIdMap = null;

    // Security runtime would populate received client creds into it
    // when it is an incoming Trust or SC message
    private static final String TRUST_CLIENT_CREDENTIALS = "TrustClientCredentialHolder";
    private static final String ISSUED_SAML_TOKEN = "IssuedSAMLToken";
    private static final String SAMLID_VS_KEY_CACHE = "SAMLID_VS_KEY_CACHE";
    private static final String INCOMING_ASSERTION_ID="Incoming_Saml_Assertion_Id";    

    // KerberosContext information
    //private Hashtable<String, KerberosContext> krbContextMap = null;
    
    // Hack required for DecryptionProcessor
    protected AlgorithmSuite algoSuite = null;
    // for Issued Token
    protected boolean policyHasIssuedToken = false;

    protected IssuedTokenContext secureConversationContext = null;
    protected IssuedTokenContext trustContext = null;

    protected MessagePolicy inferredSecurityPolicy = new MessagePolicy();
    
    protected List signConfirmIds = new ArrayList();

   // private OperationResolver operationResolver = null;
    private boolean isTrustMsg = false;
    
    private boolean isSamlSignatureKey = false;    
    
    // Version of SecurityPolicy being used
    private String securityPolicyVersion = "http://schemas.xmlsoap.org/ws/2005/07/securitypolicy";
    
    private String wscInstance = null;
    
    private long timestampTimeout = 0;        
    
    /**
     *Default constructor
     */
    public ProcessingContextImpl() {}

    /**
     *constructor
     */
    public ProcessingContextImpl(Map invocationProps) {
       properties = invocationProps; 
    }
    
    /**
     * Constructor
     * @param context the static policy context for this request
     * @param securityPolicy the SecurityPolicy to be applied for this request
     * @param message the SOAPMessage
     * @throws XWSSecurityException if there was an error in creating the ProcessingContext
     */
    public ProcessingContextImpl(StaticPolicyContext context,
            SecurityPolicy securityPolicy,
            SOAPMessage message)
            throws XWSSecurityException {
        super(context, securityPolicy, message);    
    }
    
     /**
     * copy operator
     * @param ctx1 the ProcessingContext to which to copy
     * @param ctx2 the ProcessingContext from which to copy
     * @throws XWSSecurityException if there was an error during the copy operation
     */
    public  void copy(ProcessingContext ctxx1, ProcessingContext ctxx2)
    throws XWSSecurityException {
        if (ctxx2 instanceof ProcessingContextImpl) {
            ProcessingContextImpl ctx1 = (ProcessingContextImpl)ctxx1;
            ProcessingContextImpl ctx2 = (ProcessingContextImpl)ctxx2;
            super.copy(ctx1, ctx2);
            ctx1.setIssuedTokenContextMap(ctx2.getIssuedTokenContextMap()); 
            //ctx1.setKerberosContextMap(ctx2.getKerberosContextMap());
            ctx1.setAlgorithmSuite(ctx2.getAlgorithmSuite()); 
            ctx1.setSecureConversationContext(ctx2.getSecureConversationContext());
            ctx1.setWSSAssertion(ctx2.getWSSAssertion());
            ctx1.inferredSecurityPolicy = ctx2.getInferredSecurityPolicy();
            //ctx1.setOperationResolver(ctx2.getOperationResolver());
            ctx1.isTrustMessage(ctx2.isTrustMessage());
            ctx1.hasIssuedToken(ctx2.hasIssuedToken());
            ctx1.setTimestampTimeout(ctx2.getTimestampTimeout());
            ctx1.setWSCInstance(ctx2.getWSCInstance());
            ctx1.setSCPolicyIDtoSctIdMap(ctx2.getSCPolicyIDtoSctIdMap());
       }else {
           super.copy(ctxx1, ctxx2);
       }
    }
    
    public void setIssuedTokenContextMap(Hashtable issuedTokenContextMap ) {
        this.issuedTokenContextMap = issuedTokenContextMap;
    }
    
    public Hashtable getIssuedTokenContextMap() {
        return issuedTokenContextMap;
    }
    
    /* (non-Javadoc)
     * @return SecurableSoapMessage
     */
    public SecurableSoapMessage getSecurableSoapMessage() {
        return secureMessage;
    }

    public IssuedTokenContext getIssuedTokenContext(String policyID) {
        if (issuedTokenContextMap == null) {
            //throw new RuntimeException("Internal Error: IssuedTokenContext(s) not initialized in ProcessingContext");
            return null;
        }
        return (IssuedTokenContext)issuedTokenContextMap.get(policyID);
    }

    public void setIssuedTokenContext(IssuedTokenContext issuedTokenContext, String policyID) {
        if ( issuedTokenContextMap == null ) {
            //TODO: This is temporary for testing
            // Once integrated we must throw an RT exception from here
            issuedTokenContextMap = new Hashtable();
        } 
        issuedTokenContextMap.put(policyID, issuedTokenContext);
    }
    
    public KerberosContext getKerberosContext() {
        KerberosContext krbContext = (KerberosContext)getExtraneousProperty(MessageConstants.KERBEROS_CONTEXT);
        return krbContext;
    }
    
    public void setKerberosContext(KerberosContext kerberosContext) {
        setExtraneousProperty(MessageConstants.KERBEROS_CONTEXT, kerberosContext);
    }

    public void setTrustCredentialHolder(IssuedTokenContext ctx) {
        getExtraneousProperties().put(TRUST_CLIENT_CREDENTIALS, ctx);
    }

    public IssuedTokenContext getTrustCredentialHolder() {
        return (IssuedTokenContext)getExtraneousProperties().get(TRUST_CLIENT_CREDENTIALS);
    }

    public Element getIssuedSAMLToken() {
         return (Element)getExtraneousProperties().get(ISSUED_SAML_TOKEN);
    }

    public void setIssuedSAMLToken(Element elem) {
         getExtraneousProperties().put(ISSUED_SAML_TOKEN, elem);
    }

    public void setIncomingAssertionId(String assid) {
        getExtraneousProperties().put(INCOMING_ASSERTION_ID, assid);
    }
    
    public String getIncomingAssertionId() {
        return (String)getExtraneousProperties().get(INCOMING_ASSERTION_ID);
    }
    public void setSecureConversationContext(IssuedTokenContext ctx) {
        secureConversationContext = ctx;
    }

    public IssuedTokenContext getSecureConversationContext() {
        return secureConversationContext;
    }

    public void setTrustContext(IssuedTokenContext ctx) {
        trustContext = ctx;
    }

    public IssuedTokenContext getTrustContext() {
        return trustContext;
    }

   //TODO:Having to add AlgorithmSuite here because we need
   // it in the KeyResolver (Encryption)
   public AlgorithmSuite getAlgorithmSuite() {
       return algoSuite;
   }

   public void setAlgorithmSuite(AlgorithmSuite suite) {
       algoSuite = suite;
   }

    public void setWSSAssertion(WSSAssertion wssAssertion){
        this.wssAssertion = wssAssertion;
    }
                                                                                
    public WSSAssertion getWSSAssertion(){
        return wssAssertion;
    }

    public MessagePolicy getInferredSecurityPolicy() {
        return inferredSecurityPolicy;
    }

    public HashMap getSamlIdVSKeyCache() {
        if (getExtraneousProperties().get(SAMLID_VS_KEY_CACHE) == null) {
            getExtraneousProperties().put(SAMLID_VS_KEY_CACHE, new HashMap());
        }
        return (HashMap)getExtraneousProperties().get(SAMLID_VS_KEY_CACHE);
    }

//    public void setOperationResolver(OperationResolver operationResolver){
//          this.operationResolver = operationResolver;
//    }
// 
//    public OperationResolver getOperationResolver(){
//        return operationResolver;
//    }
 
    public void isTrustMessage(boolean isTrust){
        this.isTrustMsg = isTrust;
    }

    public boolean isTrustMessage(){
        return isTrustMsg;
    }
    
    public void isSamlSignatureKey(boolean value){
        this.isSamlSignatureKey = value;
    }

    public boolean isSamlSignatureKey(){
        return this.isSamlSignatureKey;
    }
    
    public List getSignatureConfirmationIds(){
        return signConfirmIds;
    }
    
    public boolean hasIssuedToken(){
        return policyHasIssuedToken;
    } 

    public void hasIssuedToken(boolean flag){
        policyHasIssuedToken = flag;
    } 
    
    public long getTimestampTimeout() {
        return this.timestampTimeout;
    }
    
    public void setTimestampTimeout(long timeout) {
        this.timestampTimeout = timeout;
    }
    
    public void setSecurityPolicyVersion(String secPolVersion){
        this.securityPolicyVersion = secPolVersion;
    }
    
    public String getSecurityPolicyVersion(){
        return this.securityPolicyVersion;
    }
    
    public void setWSCInstance(String value){
        this.wscInstance = value;
    }
    
    public String getWSCInstance(){
        return this.wscInstance;
    }
    
    public String getWSSCVersion(String nsUri) {        
         if(MessageConstants.SECURITYPOLICY_200507_NS.equals(nsUri)){
            return MessageConstants.WSSC_NS;
        } else if(MessageConstants.SECURITYPOLICY_12_NS.equals(nsUri)){
            return MessageConstants.WSSC_13NS;
        }
        return null;
    }
    
    public void setSCPolicyIDtoSctIdMap(Hashtable scPolicyIDtoSctIdMap ) {
        this.scPolicyIDtoSctIdMap = scPolicyIDtoSctIdMap;
    }
    
    public Hashtable getSCPolicyIDtoSctIdMap() {
        return scPolicyIDtoSctIdMap;
    }
    
    public String getSCPolicyIDtoSctIdMap(String scPolicyID) {
        if (scPolicyIDtoSctIdMap == null) {            
            return null;
        }
        return (String)scPolicyIDtoSctIdMap.get(scPolicyID);
    }
}
