package interceptor;

import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;

public class Interceptor1 implements ClientInterceptor{

	public Interceptor1(){
		System.out.println("Costruttore Interceptor1");
	}
	
	public boolean handleRequest(MessageContext messageContext)throws WebServiceClientException {
		System.out.println("Interceptor1 handleRequest");
		return true;
	}

	public boolean handleResponse(MessageContext messageContext)throws WebServiceClientException {
		System.out.println("Interceptor1 handleResponse");
		return true;
	}

	public boolean handleFault(MessageContext messageContext)throws WebServiceClientException {
		System.out.println("Interceptor1 handleFault");
		return true;
	}

}
