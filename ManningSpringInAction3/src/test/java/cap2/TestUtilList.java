package cap2;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import common.CommonTestCase;

public class TestUtilList  extends CommonTestCase{
	@BeforeClass
	public static void setup(){
		  ctx =   new ClassPathXmlApplicationContext("classpath:cap2/testUtilList.xml");  
		  log.info("TestUtilList setup");
	}
	
	
	@AfterClass
	public static void cleanup(){
		log.info("TestUtilList cleanup");
	}
	
	
   @Test
   public void testUtilAnnotations() {
      //Test dell'uso di <util:list>  e T() static methopds da una classe
       List<City> cities = (List<City>) ctx.getBean("cities");
       City chosencity = (City) ctx.getBean("chosencity");
       System.out.println("chosencity name: "+chosencity.getName());
       
       //Test di util:properties
       System.out.println("chosencity state: "+chosencity.getState());
       //Se ritorna 'pippo' allora veramente il file settings.properties e' stato parsato.

   }
   
   
   @Test
   //Test della properties 'implicite' #{systemEnvironment}
   public void testSystemEnvironmentSpEL() {
	   City chosencity = (City) ctx.getBean("chosencity");
	   Map<String,String> systemEnvironmentMap = chosencity.getSystemEnvironmentMap();
	   for(String currKey:systemEnvironmentMap.keySet()){
		   System.out.println(currKey + ": "+systemEnvironmentMap.get(currKey));
	   }
   }
	   
   @Test
   //Test della properties 'implicite' #{systemProperties}
   public void testSystemPropertiesSpEL() {
	   City chosencity = (City) ctx.getBean("chosencity");
	   Map<String,String> systemPropertiesMap = chosencity.getSystemPropertiesMap();
	   for(String currKey:systemPropertiesMap.keySet()){
		   System.out.println(currKey + ": "+systemPropertiesMap.get(currKey));
	   }
   } 
   
   
   //Test degli operatori "selection"
   @Test
   public void testSelectionOperatorsSpEL() {
	   City chosencity = (City) ctx.getBean("chosencity");
	   
	   //Operatore selection .?[] ossia collezzione.?[condizione che screma la collezzione]
	   Collection bigCities = chosencity.getBigCities();
	   
	   //Operatore primo element selection .^[] ossia collezzione.?[condizione che screma la collezzione]
	   City firstBigCity =  chosencity.getFirstBigCity();
	   
	   //Operatore ultimo element selection .$[] ossia collezzione.?[condizione che screma la collezzione]
	   City lastBigCity =  chosencity.getLastBigCity();
	   
	   
   }
   
   
	   
	}

