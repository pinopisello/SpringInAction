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

package com.sun.xml.ws.security.opt.impl.crypto;

import com.sun.xml.ws.security.opt.api.SecurityElement;
import com.sun.xml.ws.security.opt.api.SecurityElementWriter;
import com.sun.xml.ws.security.opt.impl.util.XMLStreamFilter;
import com.sun.xml.ws.security.opt.crypto.StreamWriterData;
import java.util.HashMap;
import javax.xml.stream.XMLStreamWriter;
import org.jvnet.staxex.NamespaceContextEx;
import com.sun.xml.stream.buffer.XMLStreamBuffer;
/**
 *
 * @author K.Venugopal@sun.com
 */
public class SSEData implements StreamWriterData {
    
    private NamespaceContextEx nsContext;
    private boolean contentOnly;
    private SecurityElement data;
    private XMLStreamBuffer buffer = null;
    private HashMap props = new HashMap();
    
    /** Creates a new instance of SSEData */
    public SSEData(SecurityElement se , boolean contentOnly,NamespaceContextEx ns ) {
        this.data = se;
        this.nsContext = ns;
        this.contentOnly = contentOnly;
        //props.put("com.sun.xml.bind.namespacePrefixMapper", new WSSNSPrefixWrapper(JAXBUtil.prefixMapper11));
    }
    
    public SSEData(SecurityElement se , boolean contentOnly,NamespaceContextEx ns, HashMap props ) {
        this.data = se;
        this.nsContext = ns;
        this.contentOnly = contentOnly;
        this.props = props;
    }
    
    public SSEData(XMLStreamBuffer buffer){
        this.buffer = buffer;
    }
    
    public NamespaceContextEx getNamespaceContext() {
        return nsContext;
    }
    
    public SecurityElement getSecurityElement(){
        return data;
    }
    
    public void write(javax.xml.stream.XMLStreamWriter writer) throws javax.xml.stream.XMLStreamException {
        if(buffer != null){
            buffer.writeToXMLStreamWriter(writer);
        }
        
        if(contentOnly){
            XMLStreamWriter fw;
            fw = new XMLStreamFilter(writer, (com.sun.xml.ws.security.opt.impl.util.NamespaceContextEx)nsContext);
            if(props != null){
                ((SecurityElementWriter)data).writeTo(fw,props);
            }else{
                ((SecurityElementWriter)data).writeTo(fw);
            }
        }else{
            if(props != null){
                ((SecurityElementWriter)data).writeTo(writer,props);
            }else{
                ((SecurityElementWriter)data).writeTo(writer);
            }
        }
    }
    
}
