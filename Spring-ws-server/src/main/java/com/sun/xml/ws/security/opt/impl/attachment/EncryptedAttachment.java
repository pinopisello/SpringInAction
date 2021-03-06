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

package com.sun.xml.ws.security.opt.impl.attachment;

import com.sun.xml.ws.api.message.Attachment;
import com.sun.xml.ws.security.opt.impl.enc.CryptoProcessor;
import com.sun.xml.ws.util.ByteArrayDataSource;
import com.sun.xml.ws.encoding.DataSourceStreamingDataHandler;
import com.sun.xml.wss.XWSSecurityException;
import com.sun.xml.wss.swa.MimeConstants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import javax.activation.DataHandler;
import javax.crypto.Cipher;
import javax.xml.soap.AttachmentPart;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

/**
 *
 * @author Ashutosh.Shahi@sun.com
 */
public class EncryptedAttachment implements Attachment {
    
    private Attachment attachment;
    private String dataAlgo;
    private Key key;
    private byte[] data;
    
    public EncryptedAttachment(Attachment attachment, String dataAlgo, Key key) throws XWSSecurityException{
        this.attachment = attachment;
        this.dataAlgo = dataAlgo;
        this.key = key;
        
        doEncryption();
    }

    public String getContentId() {
        return attachment.getContentId();
    }

    public String getContentType() {
        return MimeConstants.APPLICATION_OCTET_STREAM_TYPE;
    }

    public byte[] asByteArray() {
        return data;
    }

    public DataHandler asDataHandler() {
        return new DataSourceStreamingDataHandler(new ByteArrayDataSource(data, getContentType()));
    }

    public Source asSource() {
        return new StreamSource(asInputStream());
    }

    public InputStream asInputStream() {
        return new ByteArrayInputStream(data);
    }

    public void writeTo(OutputStream os) throws IOException {
        os.write(asByteArray());
    }

    public void writeTo(SOAPMessage saaj) throws SOAPException {
        AttachmentPart part = saaj.createAttachmentPart();
        part.setDataHandler(asDataHandler());
        part.setContentId(getContentId());
        saaj.addAttachmentPart(part);
    }
    
    private void doEncryption() throws XWSSecurityException{
        CryptoProcessor dep = new CryptoProcessor(Cipher.ENCRYPT_MODE, dataAlgo, key); 
        data = dep.encryptData(attachment.asByteArray());
    }

}
