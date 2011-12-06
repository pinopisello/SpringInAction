package com.iona.demo;

import javax.jws.*;
import javax.xml.ws.*;
import javax.jws.soap.*;
import javax.jws.soap.SOAPBinding.*;
import javax.jws.WebParam.*;

@WebService(targetNamespace = "http://demo.iona.com", name = "quoteReporter")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public interface quoteReporter {
	@WebMethod(operationName = "getStockQuote")
	//@RequestWrapper(targetNamespace = "http://demo.iona.com/types", className = "java.lang.String")
	//@ResponseWrapper(targetNamespace = "http://demo.iona.com/types", className = "org.eric.demo.Quote")
	@WebResult(targetNamespace = "http://demo.iona.com/types", name = "updatedQuote")
	public Quote getQuote(@WebParam(targetNamespace="http://demo.iona.com/types",
			name="stockTicker",
			mode=Mode.IN) String ticker);
}