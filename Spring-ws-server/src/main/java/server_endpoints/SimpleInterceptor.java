package server_endpoints;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.EndpointInterceptor;

public class SimpleInterceptor implements EndpointInterceptor{
	private  Log logger = LogFactory.getLog(getClass());
	
	//Ritorna true se vuoi che la request colpisca l' endpoint, false se vuoi bloccare la request prima, qui!
	public boolean handleRequest(MessageContext messageContext, Object endpoint)
			throws Exception {
		logger.info("SimpleInterceptor.handleRequest");
		return true;
	}

	//In caso ritorni false, la response viene comunque inviata al client, la chain of interceptors viene pero' interrotta.
	public boolean handleResponse(MessageContext messageContext, Object endpoint)
			throws Exception {
		logger.info("SimpleInterceptor.handleResponse");
		return true;
	}

	public boolean handleFault(MessageContext messageContext, Object endpoint)
			throws Exception {
		logger.info("SimpleInterceptor.handleFault");
		return true;
	}

	public void afterCompletion(MessageContext messageContext, Object endpoint,
			Exception ex) {
		logger.info("SimpleInterceptor.afterCompletion");
		
	}

}
