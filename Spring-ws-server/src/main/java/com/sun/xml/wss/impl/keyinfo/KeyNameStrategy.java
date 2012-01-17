/*
 * $Id: KeyNameStrategy.java,v 1.5 2008-07-03 05:28:59 ofung Exp $
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

package com.sun.xml.wss.impl.keyinfo;

import java.util.logging.Level;
import java.util.logging.Logger;

import java.security.cert.X509Certificate;

import com.sun.xml.wss.logging.LogDomainConstants;
import com.sun.xml.wss.impl.SecurableSoapMessage;
import com.sun.xml.wss.XWSSecurityException;

import com.sun.xml.wss.core.KeyInfoHeaderBlock;
import com.sun.xml.wss.core.SecurityTokenReference;

public class KeyNameStrategy extends KeyInfoStrategy {

    protected static final Logger log =
        Logger.getLogger(
            LogDomainConstants.WSS_API_DOMAIN,
            LogDomainConstants.WSS_API_DOMAIN_BUNDLE);

    String keyName;

    public KeyNameStrategy() {
        this.keyName = null;
    }

    public KeyNameStrategy(String alias, boolean forSigning) {
        this.keyName = alias;
    }

    public void insertKey(
        SecurityTokenReference tokenRef,
        SecurableSoapMessage secureMsg)
        throws XWSSecurityException {

        log.log(Level.SEVERE,
                "WSS0703.unsupported.operation"); 
        throw new UnsupportedOperationException(
            "A ds:KeyName can't be put under a wsse:SecurityTokenReference");
    }


    public void insertKey(
        KeyInfoHeaderBlock keyInfo,
        SecurableSoapMessage secureMsg,
        String x509TokenId) // x509TokenId can be ignored
        throws XWSSecurityException {

        keyInfo.addKeyName(keyName);
    }

    public void setCertificate(X509Certificate cert) {
        log.log(Level.SEVERE,
                "WSS0705.unsupported.operation");
        throw new UnsupportedOperationException(
            "Setting a certificate is not a supported operation for ds:KeyName strategy");
    }

    public String getKeyName() {
        return keyName;
    }

    public String getAlias() {
        return keyName;
    }
    
    public void setKeyName(String name){
        keyName = name;
    }
}

