package interceptor;


import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;

public class Interceptor2 implements ClientInterceptor{

	public Interceptor2(){
		System.out.println("Costruttore Interceptor2");
	}
	
	
	public boolean handleRequest(MessageContext messageContext)throws WebServiceClientException {
		System.out.println("Interceptor2 handleRequest");
		return true;
	}

	public boolean handleResponse(MessageContext messageContext)throws WebServiceClientException {
		System.out.println("Interceptor2 handleResponse");
		return true;
	}

	public boolean handleFault(MessageContext messageContext)throws WebServiceClientException {
		System.out.println("Interceptor2 handleFault");
		return true;
	}

}
