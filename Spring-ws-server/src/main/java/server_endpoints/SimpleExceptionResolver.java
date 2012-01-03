package server_endpoints;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;

import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.EndpointExceptionResolver;
import org.springframework.ws.soap.SoapBody;
import org.springframework.ws.soap.SoapFault;
import org.springframework.ws.soap.SoapMessage;

public class SimpleExceptionResolver implements EndpointExceptionResolver{

	public boolean resolveException(MessageContext messageContext,Object endpoint, Exception ex) {
		SoapBody body = ((SoapMessage) messageContext.getResponse()).getSoapBody();
		Writer result = new StringWriter();
		PrintWriter printWriter = new PrintWriter(result);
		ex.printStackTrace(printWriter);
		SoapFault fault = body.addServerOrReceiverFault(result.toString(), Locale.ENGLISH);
		return true;
	}

}
