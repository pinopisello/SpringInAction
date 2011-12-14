package client;


import java.io.IOException;
import java.math.BigInteger;

import javax.jms.JMSException;
import javax.xml.transform.TransformerException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.transport.context.TransportContext;
import org.springframework.ws.transport.context.TransportContextHolder;
import org.springframework.ws.transport.jms.JmsSenderConnection;
import org.springframework.ws.transport.jms.JmsTransportException;

import com.ibm.mq.jms.MQConnectionFactory;
import com.mycompany.hr.schemas.EmployeeType;
import com.mycompany.hr.schemas.HolidayRequest;
import common.CommonTestCase;


public class SimpleJMSTestClient  extends CommonTestCase{
	
	private static final String MESSAGE =
		"<message xmlns=\"http://tempuri.org\">Hello Web Service World</message>";

	@BeforeClass
	public static void setup(){
		  ctx =   new ClassPathXmlApplicationContext("classpath*:spring-soap-jms-client.xml"); 		
		  log.info("SimpleJMSTestClient setup");
	}
	
	
	@AfterClass
	public static void cleanup(){
		log.info("SimpleJMSTestClient cleanup");
	}

	
	@Test
	public void sendTestJMS() {
		 //verifico instanza mqconnectionFactory dichiarata nel xml
		  MQConnectionFactory mqconnectionFactory = (MQConnectionFactory)ctx.getBean("connectionFactory");
		  
		  WebServiceTemplate  webServiceTemplate = (WebServiceTemplate)ctx.getBean("webServiceTemplate");
		
		  HolidayRequest hrequest = new  HolidayRequest();
		  EmployeeType employee = new EmployeeType();
		  employee.setFirstName("primonome");
		  employee.setLastName("ultimonome");
		  employee.setNumber(new BigInteger("45"));
		  hrequest.setEmployee(employee);
		  
	//	  webServiceTemplate.marshalSendAndReceive(hrequest);
		  
		  webServiceTemplate.marshalSendAndReceive( hrequest, new WebServiceMessageCallback() {

			  //Setto il CorrelationID nell'omonimo jms message header 
	            public void doWithMessage(WebServiceMessage request) throws IOException, TransformerException {
	            	TransportContext transportContext = TransportContextHolder.getTransportContext();
	                JmsSenderConnection connection = (JmsSenderConnection) transportContext.getConnection();
	                String corrID = Long.toString(System.currentTimeMillis());
	                try {
	                    connection.getRequestMessage().setJMSCorrelationID(corrID);
	                }
	                catch (JMSException e) {
	                    throw new JmsTransportException(e);
	                }

	            	
	            }
	        });
		 
		 /* 
		  StreamSource source = new StreamSource(new StringReader(MESSAGE));
		  StreamResult result = new StreamResult(System.out);
		  webServiceTemplate.sendSourceAndReceiveToResult(source, result);
		  */
	}

}
