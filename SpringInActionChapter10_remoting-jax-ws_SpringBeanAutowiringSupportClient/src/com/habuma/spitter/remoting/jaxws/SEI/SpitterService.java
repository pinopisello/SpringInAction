package com.habuma.spitter.remoting.jaxws.SEI;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.habuma.spitter.remoting.jaxws.server.Spitter;
import com.habuma.spitter.remoting.jaxws.server.Spittle;



@WebService(
		name = "SpitterService",//wsdl:portType name="..." da' anche  il nome al file wsdl in java2wsdl
		serviceName="SpitterServiceNomeServizio",//wsdl:definitions name="..."  wsdl:binding name="...SoapBinding"  wsdl:service name="...",
        targetNamespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService",
        portName="SpitterServiceEndpointPort" //wsdl:port name="..." 
)


@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public interface SpitterService {
  
 
  @WebMethod(operationName = "retrieveSpittle")
  @WebResult(targetNamespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService",name = "spittleObject")
  Spittle getSpittleById(@WebParam(name="spittleInputId", mode=Mode.IN ) long id);
  

	
  @WebMethod(operationName = "retrieveSpitterById")
  @WebResult(targetNamespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService",name = "spitterObject")
  Spitter getSpitterById(@WebParam(name="spitterInputId", mode=Mode.IN ) long id);
  
 
  @WebMethod(operationName = "retrieveSpitterByFullName")
  @WebResult(targetNamespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService",name = "spitterObject")
  Spitter getSpitterByFullName(@WebParam(name="spitterInputFullName", mode=Mode.IN ) String fullName);
  
  
}
