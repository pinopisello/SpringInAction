

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import Service.Servizio;

public class XMLDeclaredTransactionsTest {
  
	static ApplicationContext ctx ;
	 
	 
	public static void main(String[] args) {
        ctx =  new ClassPathXmlApplicationContext("xml_declared_transaction_test.xml");
        Servizio servizio = (Servizio)ctx.getBean("Servizio");
        servizio.metodoTransazioneJTA();
        System.out.println("Transazione eseguita!");  
  }
  /*
   * Funziona cosi: 
   * 
   * 
   * 1)xml_declared_transaction_test.xml dichiara 
   * 
   * <tx:advice > 
   * <tx:method name="metodoTransazioneJTA" propagation="REQUIRED" timeout="800" /
   * 
   * cio' vuol dire che il metodo metodoTransazioneJTA() viene "advised" da una transazione JTA
   * con isolazione "REQUIRED" [se c'e' gia transazione gira in questa m,altrimenti creane una nuova]
   * e timeout 800 secs.
   * 
   * 2)xml_declared_transaction_test.xml dichiara 
   * <aop:advisor pointcut="execution(* *..Servizio.*(..))" advice-ref="txAdvice" />
   * ossia quali classi vanno advised con l'advise dichiarato in 1).
   * 
   * 
   * 3)xml_declared_transaction_test.xml dichiara 
   * 
   * a)Un implementazione javax.transaction.UserTransaction 
   *        <bean id="jbossUserTransaction" class="com.arjuna.ats.internal.jta.transaction.arjunacore.UserTransactionImple"/>
   * b)Un implementazione javax.transaction.TransactionManager
   *        <bean id="jbossTransactionManager"  class="com.arjuna.ats.internal.jta.transaction.arjunacore.TransactionManagerImple"> </bean>
   * c)Uno Spring JAT transaction manager  iniettato dei UserTransaction e TransactionManager definiti in a e b.
   * 
   *          
   *   <bean id="transactionManager"  class="org.springframework.transaction.jta.JtaTransactionManager">
   *	  <property name="transactionManager">
   *       <ref bean="jbossTransactionManager" />
   *	  </property>
   *	  <property name="userTransaction">
   *	   <ref bean="jbossUserTransaction" />
   *	  </property>
   *   </bean>      
   *        
   *   Tutto cio crea un TransactionInterceptors che intercetta tutte le chiamate al metodo advised.
   *   Tale interceptor chiama a sua volta JtaTransactionManager.doBegin() per poi chiamare il metodo advised [vedi TransactionInterceptors.invoke()]
   *   Qui, in ServizioImpl.metodoTransazioneJTA(), tutte le chiamate a risorse che partecipano alla transazione si devono registrare.
   *   Nel caso specifico, TestHibernateSupportDAODB1Impl.getHibernateTemplate() chiama HibernateTemplate.getSession() che
   *   a sua volta SessionFactoryUtils.doGetSession().Qui c'e' una chiamata a TransactionSynchronizationManager.registerSynchronization()
   *   che lega la  sessione Hibernate alla transazione corrente. 
   *   
   *   
   *   Se non ci sono  eccezzioni in TransactionInterceptors.invoke(), TransactionInterceptors.commitTransactionAfterReturning() chiama
   *   JtaTransactionManager.commit().
   *   
   *   Qui i seguenti vengono chiamati in successione:
   *  				prepareForCommit(status);  --fa nulla
   *				triggerBeforeCommit(status);  -- TransactionSynchronizationUtils itera tutte le TransactionSynchronization 
   *												 contentute in TransactionSynchronizationManager  e per ognuna chiama beforeCommit.
   *								                 Cio triggera us Session.flush()per le TransactionSynchronization di tipo Hibernate e qui 
   *												 eventuali eccezzioni SQL vengono triggerate.
   *												 In tal caso vengono catchate in JtaTransactionManager e JtaTransactionManager.doRollbackOnCommitException(status, ex)
   *												 chiama TransactionImple.rollbackAndDisassociate().
   *												 Sempre in JtaTransactionManager.doRollbackOnCommitException() c'e' chiamata a 
   *												 triggerAfterCompletion.triggerAfterCompletion() chiama TransactionSynchronizationUtils.invokeAfterCompletion(synchronizations, completionStatus.ROLLBACK)
   *												 che itera tutte le TransactionSynchronization 
   *												 contentute in TransactionSynchronizationManager  e per ognuna chiama synchronization.afterCompletion(completionStatus.ROLLBACK).
   *												 E' qui che Hibernate.Session.clse(0 viene chiamato.
   *
   *				triggerBeforeCompletion(status);
   *				doCommit(status);                --
   *        
   *        
   *        
   *        
   */
 
}
