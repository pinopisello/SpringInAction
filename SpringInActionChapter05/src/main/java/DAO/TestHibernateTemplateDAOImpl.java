package DAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import entity.Test;

@Repository("testHibernateTemplate")
public class TestHibernateTemplateDAOImpl implements TestDAO{
    private HibernateTemplate hibernateTemplate;
     
    
       @Autowired
        public void setSessionFactory(SessionFactory sessionFactory)
        {
            this.hibernateTemplate = new HibernateTemplate(sessionFactory);
        }
        
   
        public Test getTest(Integer pk) {
                return hibernateTemplate.get(Test.class, pk);
        }
             
        
}
