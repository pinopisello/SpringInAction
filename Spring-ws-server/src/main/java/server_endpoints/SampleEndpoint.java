package server_endpoints;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.soap.SoapBody;
import org.springframework.ws.soap.SoapEnvelope;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;

import com.mycompany.hr.schemas.HolidayRequest;
import com.mycompany.hr.schemas.HolidayResponse;


@Endpoint
public class SampleEndpoint  {

	public SampleEndpoint(){
		 System.out.println("SampleEndpoint constructor");
		   
	}
	
	@ResponsePayload
	@PayloadRoot(localPart="HolidayRequest", namespace="http://mycompany.com/hr/schemas")
	public  HolidayResponse  getOrder(@RequestPayload HolidayRequest holidayRequest,SoapHeader soapHeader,SoapMessage soapMessage, SoapBody soapBody, SoapEnvelope soapEnvelope)throws Exception {
		HolidayResponse out = new HolidayResponse();
		out.setOutcome("667");
		System.out.println("HolidayRequest per "+holidayRequest.getEmployee().getFirstName());
		//int e = 1/0;
		//if (true)
		//throw new Exception("pippo");
		return  out;
    }
}