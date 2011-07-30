package DAO.DAO_DB2;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import DAO.DAO_DB1.TestDAO;
import entity.Test;

@Repository("DB2_hibernateSupportDAO")
public class TestHibernateSupportDAODB2Impl  extends HibernateDaoSupport implements TestDAO{
	
	 @Autowired
     public void setSFactory(SessionFactory sessionFactory_db2)
     {
		 super.setSessionFactory(sessionFactory_db2);
     }
	
	 public Test getTest(Integer pk) {
         return getHibernateTemplate().get(Test.class, pk);
 }  
}
