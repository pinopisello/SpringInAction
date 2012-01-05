package JUnit;

import javax.xml.transform.Source;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ws.test.server.MockWebServiceClient;
import org.springframework.xml.transform.StringSource;

import static org.springframework.ws.test.server.RequestCreators.*; 
import static org.springframework.ws.test.server.ResponseMatchers.*;



//Permette di runnare gli endpoints SENZA l uso delle queue o del server http utilizzando lo stesso spring-xml
//usator ealmente dal lato server.Non mi sembra cosi figo ... tanto vale usate il vero lato server ed un client ...

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration("classpath*:spring-soap-jms-server.xml") //Specifica qual e' il context da caricare.
public class HolidayIntregrationTest {
	
	@Autowired
	private ApplicationContext applicationContext; 
	private MockWebServiceClient mockClient;
	
	
	@Before
	public void createClient() {
		mockClient = MockWebServiceClient.createClient(applicationContext); 
	}
	
	
	
	@Test
	public void customerEndpoint() throws Exception {
	
		Source requestPayload = new StringSource(
				"<ns2:HolidayRequest xmlns:ns2='http://mycompany.com/hr/schemas'>"+
				"<ns2:Employee>"+
				"<ns2:Number>45</ns2:Number>"+
				"<ns2:FirstName>primonome</ns2:FirstName>"+
				"<ns2:LastName>ultimonome</ns2:LastName>"+
				"</ns2:Employee></ns2:HolidayRequest>"
				);
		
		Source responsePayload = new StringSource(
		"<customerCountResponse xmlns='http://springframework.org/spring-ws'>" +
		"<customerCount>10</customerCount>" +
		"</customerCountResponse>");
		
		mockClient.sendRequest(withPayload(requestPayload)).andExpect(payload(responsePayload)); 
	}
}

