package client;

import java.io.IOException;

import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.FaultMessageResolver;

public class SimpleFaultMessageResolver implements FaultMessageResolver{

	public void resolveFault(WebServiceMessage message) throws IOException {
		System.out.println(message);
		
	}

}
