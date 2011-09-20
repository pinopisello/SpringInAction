package Base;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import Common.Constants;



public class BaseHibernateConnection extends Constants{
	private  static String SELECTED_ENVIRONMENT;//DEV,QA,PSUP,UAT,PROD
	
	public  static String PSUP_ENVIRONMENT="PSUP";
	public  static String DEV_ENVIRONMENT="DEV";
	public  static String QA_ENVIRONMENT="QA";
	public  static String UAT_ENVIRONMENT="UAT";
	public  static String PROD_ENVIRONMENT="PROD";	
	
	private  static File XCELYS_PROD_CFG_FILEPATH = new File("C:\\Miei\\Eclipse_Workspaces\\KWebServicesWS\\hibernate_mapping\\ant\\Xcelys\\cfg\\Hibernate_Xcelys_Prod.cfg.xml");
	private  static File XCELYS_PSUP_CFG_FILEPATH = new File("C:\\Miei\\Eclipse_Workspaces\\KWebServicesWS\\hibernate_mapping\\ant\\Xcelys\\cfg\\Hibernate_Xcelys_PSUP.cfg.xml");
	private  static File XCELYS_QA_FILEPATH = new File("C:\\Miei\\Eclipse_Workspaces\\KWebServicesWS\\hibernate_mapping\\ant\\Xcelys\\cfg\\Hibernate_Xcelys_PSUP.cfg.xml");
	private  static File XCELYS_DEV_FILEPATH = new File("C:\\Miei\\Eclipse_Workspaces\\KWebServicesWS\\hibernate_mapping\\ant\\Xcelys\\cfg\\Hibernate_Xcelys_PSUP.cfg.xml");
	
	private  static File BETS_PROD_CFG_FILEPATH = new File("C:\\Miei\\Eclipse_Workspaces\\KWebServicesWS\\hibernate_mapping\\ant\\BETS\\cfg\\Hibernate_BETS_PROD.cfg.xml");
	private  static File BETS_COUAT_CFG_FILEPATH = new File("C:\\Miei\\Eclipse_Workspaces\\KWebServicesWS\\hibernate_mapping\\ant\\BETS\\cfg\\Hibernate_BETS_COUAT.cfg.xml");
	private  static File BETS_T5WIT_CFG_FILEPATH = new File("C:\\Miei\\Eclipse_Workspaces\\KWebServicesWS\\hibernate_mapping\\ant\\BETS\\cfg\\Hibernate_BETS_T5WIT.cfg.xml");
	private  static File BETS_COWIT_CFG_FILEPATH = new File("C:\\Miei\\Eclipse_Workspaces\\KWebServicesWS\\hibernate_mapping\\ant\\BETS\\cfg\\Hibernate_BETS_COWIT.cfg.xml");
		
	
	
	private  static SessionFactory XCELYS_SESSION_FACTORY;
	private  static SessionFactory BETS_SESSION_FACTORY;
	
	
	
	public static void setEnvironment(String env){
		if(!(SELECTED_ENVIRONMENT!=null && SELECTED_ENVIRONMENT.equals(env))){
			SELECTED_ENVIRONMENT = env;
			buildConnectionFactories();
		}	
	}
	
	
	
	private  static void buildConnectionFactories() {
		if(SELECTED_ENVIRONMENT == null){
			System.err.print("Seleziona un Environment!![DEV,QA,PSUP,UAT,PROD]");
			System.exit(1);
		}
		if(SELECTED_ENVIRONMENT.equals("PROD")){
			//XCELYS_SESSION_FACTORY = new AnnotationConfiguration().configure(XCELYS_PROD_CFG_FILEPATH).buildSessionFactory();
			BETS_SESSION_FACTORY = new AnnotationConfiguration().configure(BETS_PROD_CFG_FILEPATH).buildSessionFactory();
		}else
		if(SELECTED_ENVIRONMENT.equals("PSUP")){
			XCELYS_SESSION_FACTORY = new AnnotationConfiguration().configure(XCELYS_PSUP_CFG_FILEPATH).buildSessionFactory();
			BETS_SESSION_FACTORY = new AnnotationConfiguration().configure(BETS_COUAT_CFG_FILEPATH).buildSessionFactory();
		}else
		if(SELECTED_ENVIRONMENT.equals("QA")){
			XCELYS_SESSION_FACTORY = new AnnotationConfiguration().configure(XCELYS_QA_FILEPATH).buildSessionFactory();
			BETS_SESSION_FACTORY = new AnnotationConfiguration().configure(BETS_COWIT_CFG_FILEPATH).buildSessionFactory();
		}else
		if(SELECTED_ENVIRONMENT.equals("DEV")){
			XCELYS_SESSION_FACTORY = new AnnotationConfiguration().configure(XCELYS_DEV_FILEPATH).buildSessionFactory();
			BETS_SESSION_FACTORY = new AnnotationConfiguration().configure(BETS_COWIT_CFG_FILEPATH).buildSessionFactory();
		}	//else
		if(SELECTED_ENVIRONMENT.equals("UAT")){
			XCELYS_SESSION_FACTORY = new AnnotationConfiguration().configure(XCELYS_PSUP_CFG_FILEPATH).buildSessionFactory();
			BETS_SESSION_FACTORY = new AnnotationConfiguration().configure(BETS_T5WIT_CFG_FILEPATH).buildSessionFactory();
		}
	}
	
	
	public static Session openXcelysSession()throws Exception{
		if(XCELYS_SESSION_FACTORY == null)
		    throw new Exception("XCELYS_SESSION_FACTORY non inizializzata!!Chiama setEnvironment(env prima.)");
		return  XCELYS_SESSION_FACTORY.openSession();
	}
	
	public static Session openBETSSession() throws Exception {
		if(BETS_SESSION_FACTORY == null)
			throw new Exception("BETS_SESSION_FACTORY non inizializzata!!Chiama setEnvironment(env prima.)");
		return  BETS_SESSION_FACTORY.openSession();
	}
	


}
