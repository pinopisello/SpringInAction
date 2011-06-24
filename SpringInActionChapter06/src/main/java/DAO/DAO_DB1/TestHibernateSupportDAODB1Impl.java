package DAO.DAO_DB1;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import entity.Test;

@Repository("DB1_hibernateSupportDAO")
public class TestHibernateSupportDAODB1Impl  extends HibernateDaoSupport implements TestDAO{
	
	 @Autowired
     public void setSFactory(SessionFactory sessionFactory_db1)
     {
		 super.setSessionFactory(sessionFactory_db1);
     }
	
	 public Test getTest(Integer pk) {
         return getHibernateTemplate().get(Test.class, pk);
 }
}
