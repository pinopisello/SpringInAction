/*
 * $Id: AttachmentSignatureInput.java,v 1.6 2008-07-03 05:29:06 ofung Exp $
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

package com.sun.xml.wss.impl.resolver;

import java.util.Vector;
import java.util.Iterator;
import java.io.IOException;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;

import javax.xml.soap.SOAPException;
import javax.xml.soap.AttachmentPart;

import com.sun.org.apache.xml.internal.security.signature.XMLSignatureInput;

public class AttachmentSignatureInput extends XMLSignatureInput {
   private String _cType = null;
   private Vector _mhs = new Vector();

   public AttachmentSignatureInput(byte[] input) { 
       super(input);
   }

   public void setMimeHeaders(Vector mimeHeaders) {
       _mhs = mimeHeaders;
   }

   public Vector getMimeHeaders() {
      return _mhs;
   }

   public void setContentType(String _cType) {
       this._cType = _cType;
   }

   public String getContentType() {
       return _cType;
   }

   public static final Object[] _getSignatureInput(AttachmentPart _part) throws SOAPException, IOException {
       Iterator mhItr = _part.getAllMimeHeaders();

       Vector mhs = new Vector();
       while (mhItr.hasNext()) mhs.add(mhItr.next());        

       // extract Content
       //Object content = _part.getContent();
       OutputStream baos = new ByteArrayOutputStream();  
       _part.getDataHandler().writeTo(baos);          

       return new Object[] {mhs, ((ByteArrayOutputStream)baos).toByteArray()};
   }
}


