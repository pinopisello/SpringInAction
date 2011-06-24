package server_endpoints;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;

import com.mycompany.hr.schemas.HolidayRequest;


@Endpoint
public class SampleEndpoint   {

	public SampleEndpoint(){
		 System.out.println("SampleEndpoint constructor");
	}
	
	
	@PayloadRoot(localPart="HolidayRequest", namespace="http://mycompany.com/hr/schemas")
	public void getOrder(HolidayRequest holidayRequest) {
        System.out.println("HolidayRequest per "+holidayRequest.getEmployee().getFirstName());
    }

}