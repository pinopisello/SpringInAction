package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAO.DAO_DB1.TestDAO;
import entity.Test;


@Service("Servizio")
public class ServizioImpl implements Servizio{

	@Autowired
	TestDAO  DB1_hibernateSupportDAO ;
	@Autowired
	TestDAO  DB2_hibernateSupportDAO ;
	

   public  void metodoTransazioneJTA() {
         Test entity_DB1 = DB1_hibernateSupportDAO.getTest(2);
         System.out.println(entity_DB1.getName());
         entity_DB1.setColonna3("22");
         //A questo punto CC non e' propagato verso DB.Viene propagato quando la transazione committa [uscita da metodoTransazioneJTA].
       
         Test entity_DB2 = DB2_hibernateSupportDAO.getTest(2);
         System.out.println(entity_DB2.getName());        
         entity_DB2.setColonna3("111"); //Fallisce perche colonna3 e' char[2]
         
         //In pratica hibernateSupportDAO e' la stessa ciccia di  hibernateTemplateDAO con la sola
         //differenza che crea un istanza hibernateTemple da sola.  	 
	  }


}
