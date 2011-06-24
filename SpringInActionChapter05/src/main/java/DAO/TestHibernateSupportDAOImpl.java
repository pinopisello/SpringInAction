package DAO;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import entity.Test;

@Repository("testHibernateSupportDAO")
public class TestHibernateSupportDAOImpl  extends HibernateDaoSupport implements TestDAO{
	
	 @Autowired
     public void setSFactory(SessionFactory sessionFactory)
     {
		 super.setSessionFactory(sessionFactory);
     }
	
	 public Test getTest(Integer pk) {
         return getHibernateTemplate().get(Test.class, pk);
 }
}
