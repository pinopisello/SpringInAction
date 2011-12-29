package server_endpoints;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.mycompany.hr.schemas.HolidayRequest;
import com.mycompany.hr.schemas.HolidayResponse;


@Endpoint
public class SampleEndpoint   {

	public SampleEndpoint(){
		 System.out.println("SampleEndpoint constructor");
	}
	
	
	@PayloadRoot(localPart="HolidayRequest", namespace="http://mycompany.com/hr/schemas")
	@ResponsePayload
	public  HolidayResponse  getOrder(@RequestPayload HolidayRequest holidayRequest) {
		HolidayResponse out = new HolidayResponse();
		out.setOutcome("positivo");
		System.out.println("HolidayRequest per "+holidayRequest.getEmployee().getFirstName());
        return  out;
    }

}