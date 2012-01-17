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

package com.sun.xml.wss.impl.misc;

import com.sun.xml.wss.NonceManager;
import com.sun.xml.wss.XWSSecurityException;
import com.sun.xml.wss.logging.LogDomainConstants;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DefaultNonceManager extends NonceManager {

    private static final boolean USE_DAEMON_THREAD = true;
    private static final Timer nonceCleanupTimer = new Timer(USE_DAEMON_THREAD);
    
    // Nonce Cache
    private NonceCache nonceCache = null;
    
     /** logger */
    protected static final Logger log = Logger.getLogger(
            LogDomainConstants.WSS_API_DOMAIN, LogDomainConstants.WSS_API_DOMAIN_BUNDLE);
    
    public DefaultNonceManager() {
    }

    @Override
    public boolean validateNonce(String nonce, String created) throws NonceException {
        if ((nonceCache == null) || ((nonceCache != null) && nonceCache.wasCanceled())) {
            initNonceCache(getMaxNonceAge());
        }
        //  check if the reclaimer Task is scheduled or not
        if (!nonceCache.isScheduled()) {
            if (log.isLoggable(Level.FINE)) {
                log.log(Level.FINE,
                        "About to Store a new Nonce, but Reclaimer not Scheduled, so scheduling one" + nonceCache);
            }
            setNonceCacheCleanup();
        }
        return nonceCache.validateAndCacheNonce(nonce, created);
    }
    
    private synchronized void setNonceCacheCleanup() {

        if (!nonceCache.isScheduled()) {
            if (log.isLoggable(Level.FINE)) {
                log.log(Level.FINE, "Scheduling Nonce Reclaimer task...... for " + this + ":" + nonceCache);
            }
            nonceCleanupTimer.schedule(
                    nonceCache,
                    nonceCache.getMaxNonceAge(), // run it the first time after
                    nonceCache.getMaxNonceAge()); //repeat every
            nonceCache.scheduled(true);
        }
    }
    
    private synchronized void initNonceCache(long maxNonceAge) {

        if (nonceCache == null) {
            nonceCache = new NonceCache(maxNonceAge);
            if (log.isLoggable(Level.FINE)) {
                log.log(Level.FINE, "Creating NonceCache for first time....." + nonceCache);
            }
        } else if (nonceCache.wasCanceled()) {
            nonceCache = new NonceCache(maxNonceAge);
            if (log.isLoggable(Level.FINE)) {
                log.log(Level.FINE, "Re-creating NonceCache because it was canceled....." + nonceCache);
            }
        }
    }

}
