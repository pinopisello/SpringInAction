/*
 * $Id: SubjectLocality.java,v 1.7 2008-07-03 05:29:12 ofung Exp $
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
import com.sun.xml.wss.saml.internal.saml11.jaxb20.SubjectLocalityType;
import com.sun.xml.wss.saml.util.SAMLJAXBUtil;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;

/**
The <code>SubjectLocality</code> element specifies the DNS domain name
and IP address for the system entity that performed the authentication.
It exists as part of <code>AuthenticationStatement</code> element.
*/
public class SubjectLocality extends SubjectLocalityType
    implements com.sun.xml.wss.saml.SubjectLocality {
    
    protected static final Logger log = Logger.getLogger(
            LogDomainConstants.WSS_API_DOMAIN,
            LogDomainConstants.WSS_API_DOMAIN_BUNDLE);

    /**
    Constructor
    Constructor taking in nothing (assertion schema 25 allows it )
    */
    public SubjectLocality() {
        super();
    }

    /**
     * Constructs an instance of <code>SubjectLocality</code> from an existing
     * XML block.
     *
     * @param localityElement A <code>org.w3c.dom.Element</code> representing
     *        DOM tree for <code>SubjectLocality</code> object.
     * @exception SAMLException if it could not process the Element properly,
     *            implying that there is an error in the sender or in the
     *            element definition.
     */
    public static SubjectLocalityType fromElement(org.w3c.dom.Element element)
        throws SAMLException {
        try {
            JAXBContext jc = SAMLJAXBUtil.getJAXBContext();
                    
            javax.xml.bind.Unmarshaller u = jc.createUnmarshaller();
            return (SubjectLocalityType)u.unmarshal(element);
        } catch ( Exception ex) {
            throw new SAMLException(ex.getMessage());
        }
    }

    /**
     * Constructs an instance of <code>SubjectLocality</code>.
     *
     * @param ipAddress String representing the IP Address of the entity
     *        that was authenticated.
     * @param dnsAddress String representing the DNS Address of the entity that
     *        was authenticated. As per SAML specification  they are both
     *        optional, so values can be null.
     */
    public SubjectLocality(String ipAddress, String dnsAddress) {
        setIPAddress(ipAddress);
        setDNSAddress(dnsAddress);
    }
    
    @Override
    public String getDNSAddress(){
        return super.getDNSAddress();
    }

    @Override
    public String getIPAddress(){
        return super.getIPAddress();
    }
}
