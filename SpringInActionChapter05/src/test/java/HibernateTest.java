

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import DAO.TestDAO;

import entity.Test;

public class HibernateTest {
  public static void main(String[] args) {
	  ApplicationContext ctx =null;
	  try{
         ctx =  new ClassPathXmlApplicationContext("hibernate_test.xml");
         TestDAO  hibernateTemplateDAO = (TestDAO)ctx.getBean("testHibernateTemplate");
         Test trovato = hibernateTemplateDAO.getTest(2);
         System.out.println(trovato.getName());
         
         TestDAO  hibernateSupportDAO = (TestDAO)ctx.getBean("testHibernateSupportDAO");
         trovato = hibernateSupportDAO.getTest(2);
         System.out.println(trovato.getName());        
         
         //In pratica hibernateSupportDAO e' la stessa ciccia di  hibernateTemplateDAO con la sola
         //differenza che crea un istanza hibernateTemple da sola.
         
         
	  }catch(Exception e){ 
	  e.printStackTrace();
	  }
    
 
  
  }
}
