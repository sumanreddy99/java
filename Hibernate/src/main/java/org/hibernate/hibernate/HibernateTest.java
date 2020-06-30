package org.hibernate.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import Hibernate_eclipse.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserDetails userDetails=new UserDetails();
		userDetails.setUserId(1);
		userDetails.setUserName("First User");
		
		// create session factory object

		Configuration configuration=new Configuration();//.configure();
		/*
		 * ServiceRegistry serviceRegistry= new ServiceRegistryBuilder()
		 * .applySettings(configuration.getProperties()).buildServiceRegistry();
		 * SessionFactory factory=configuration.buildSessionFactory(serviceRegistry);
		 */
		SessionFactory factory=configuration.configure().buildSessionFactory();
		Session session=factory .openSession();
		session.beginTransaction();
		session.save(userDetails);
		session.getTransaction().commit();
		//session.close();
		
	}

}
