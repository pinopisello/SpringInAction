package client;


import java.io.IOException;
import java.math.BigInteger;

import javax.xml.namespace.QName;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapHeaderElement;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.transport.context.TransportContext;
import org.springframework.ws.transport.context.TransportContextHolder;
import org.springframework.ws.transport.jms.JmsSenderConnection;
import org.springframework.xml.transform.StringSource;

import com.mycompany.hr.schemas.EmployeeType;
import com.mycompany.hr.schemas.HolidayRequest;
import com.mycompany.hr.schemas.HolidayResponse;
import common.CommonTestCase;


public class SimpleJMSTestClient  extends CommonTestCase{
	
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
		// e provo a creare una connessione, un consumer e provo a leggere un message con un selector.
		/*  try{
		  MQConnectionFactory mqconnectionFactory = (MQConnectionFactory)ctx.getBean("connectionFactory");
		  Connection conn = mqconnectionFactory.createConnection();
		  conn.start();
		  Session session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);
		  Queue responsequeue =  session.createQueue("QA.CA.XCELYS.GRP.CHG.PBLSH.EVN");
          String messageSelector = "JMSMessageID='ID:414d512051414b5049423030202020204ede75342d5fef09'";
          MessageConsumer messageConsumer = session.createConsumer(responsequeue,messageSelector);
          Message messaggioLetto = messageConsumer.receive(1111) ;// receive(3000);
          
		  System.out.println(messaggioLetto);
		  }catch(JMSException je){
			  je.printStackTrace();
		  }
*/
		  
		  WebServiceTemplate  webServiceTemplate = (WebServiceTemplate)ctx.getBean("webServiceTemplate");

		  HolidayRequest hrequest = new  HolidayRequest();
		  EmployeeType employee = new EmployeeType();
		  employee.setFirstName("xyz");
		  employee.setLastName("gfh");
		  employee.setNumber(new BigInteger("45"));
		  hrequest.setEmployee(employee);
		  
	      //webServiceTemplate.marshalSendAndReceive(hrequest);
		  //Il callback permette di modificare la request DOPO che il payload e' stato settato 
		  //ma PRIMA che la request venga effettivamente inviata
		  HolidayResponse risposta = (HolidayResponse)webServiceTemplate.marshalSendAndReceive( hrequest, new WebServiceMessageCallback() {

			  //Setto il CorrelationID nell'omonimo jms message header 
	            public void doWithMessage(WebServiceMessage request) throws IOException, TransformerException {
	            	//Aggiungo SOAP HEADER attribute e/o element
	            	/*
	            	<soapenv:Header>
			            <wsse:Security xmlns:wsse="http://schemas.xmlsoap.org/ws/2002/xx/secext">
				            <wsse:UserNameToken>
					            <wsse:UserName>kpbetsuser</wsse:UserName>
					            <wsse:Password>kpbetsuserpwd</wsse:Password>
				            </wsse:UserNameToken>
			            </wsse:Security>
	            	</soapenv:Header>
	            	
	            	//header.addAttribute(new javax.xml.namespace.QName("http://ddddd.ff.dddddd", "","diamond"), "sss");//  public QName(String namespaceURI, String localPart, String prefix) {
	            	*/
	            	 SoapHeader header = ((SoapMessage)request).getSoapHeader();
	            	 StringSource headerSource = new StringSource("<wsse:Security xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\">"+
				            "<wsse:UsernameToken>"+
					            "<wsse:Username>kpbetsuser</wsse:Username>"+
					            "<wsse:Password>kpbetsuserpwd</wsse:Password>"+
				            "</wsse:UsernameToken>"+
			            "</wsse:Security>");
	                  Transformer transformer = TransformerFactory.newInstance().newTransformer();
	                  transformer.transform(headerSource, header.getResult());

	            	TransportContext transportContext = TransportContextHolder.getTransportContext();
	                JmsSenderConnection connection = (JmsSenderConnection) transportContext.getConnection();
	                String corrID = Long.toString(System.currentTimeMillis());
	                
	                /*    try {
	                    connection.getRequestMessage().setJMSCorrelationID(corrID);
	                    connection.getRequestMessage().setJMSMessageID(corrID); //Se imponi JMSCorrelationID,devi imporre JMSMessageID nella request altrimenti il client non ricevera' la response.
	                    System.out.println(connection.getRequestMessage());
	                    //Usato dal receiver per capire quale queue droppare la risposta
	                    //Attenzione!! Lato server[JmsReceiverConnection.onSendBeforeWrite] legge il JMSCorrelationId della request e lo scrive nel 
	                    //JMSCorrelationId della response.Se JMSCorrelationId id request e' null, server setta JMSCorrelationId response = JMSMessageID request.
	                    
	                    //Il client legge la response SEMPRE filtrando su response.JMSCorrelationId = request.JMSMessageID.
	                    
	                    //Quindi se si impone un JMSCorrelationId nella request, occorre settare JMSMessageId request in JmsSenderConnection.requestMessage.
	                    
	                    
	                    
	                }
	                catch (JMSException e) {
	                    throw new JmsTransportException(e);
	                }*/
	            }
	        }
		  );
		  System.out.println("SimpleJMSTestClient ricevuto risposta.outcome = :" + risposta.getOutcome());
		 
		
	}

}
