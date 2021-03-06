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

package com.sun.xml.ws.security.opt.api.keyinfo;

import com.sun.xml.ws.security.secext10.SecurityTokenReferenceType;
import java.math.BigInteger;

/**
 *
 * @author K.Venugopal@sun.com
 */
public interface DerivedKeyToken {
    /**
     * Gets the value of the algorithm property.
     * 
     * 
     * @return possible object is
     *     {@link String }
     */
    String getAlgorithm();

    /**
     * Gets the value of the generation property.
     * 
     * 
     * @return possible object is
     *     {@link BigInteger }
     */
    BigInteger getGeneration();

    /**
     * Gets the value of the id property.
     * 
     * 
     * @return possible object is
     *     {@link String }
     */
    String getId();

    /**
     * Gets the value of the label property.
     * 
     * 
     * @return possible object is
     *     {@link String }
     */
    String getLabel();

    /**
     * Gets the value of the length property.
     * 
     * 
     * @return possible object is
     *     {@link BigInteger }
     */
    BigInteger getLength();

    /**
     * Gets the value of the nonce property.
     * 
     * 
     * @return possible object is
     *     byte[]
     */
    byte[] getNonce();

    /**
     * Gets the value of the offset property.
     * 
     * 
     * @return possible object is
     *     {@link BigInteger }
     */
    BigInteger getOffset();

    /**
     * Gets the value of the securityTokenReference property.
     * 
     * 
     * @return possible object is
     *     {@link SecurityTokenReferenceType }
     */
    SecurityTokenReferenceType getSecurityTokenReference();

    /**
     * Sets the value of the algorithm property.
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     */
    void setAlgorithm(String value);

    /**
     * Sets the value of the generation property.
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     */
    void setGeneration(BigInteger value);

    /**
     * Sets the value of the id property.
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     */
    void setId(String value);

    /**
     * Sets the value of the label property.
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     */
    void setLabel(String value);

    /**
     * Sets the value of the length property.
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     */
    void setLength(BigInteger value);

    /**
     * Sets the value of the nonce property.
     * 
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    void setNonce(byte[] value);

    /**
     * Sets the value of the offset property.
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     */
    void setOffset(BigInteger value);

    /**
     * Sets the value of the securityTokenReference property.
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityTokenReferenceType }
     */
    void setSecurityTokenReference(SecurityTokenReferenceType value);
    
}
