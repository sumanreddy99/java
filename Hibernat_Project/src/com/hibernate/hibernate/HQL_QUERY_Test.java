package com.hibernate.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.hibernate.dto.CRUD_UserDetails;

public class HQL_QUERY_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Configuration configuration = new Configuration().configure();

		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
				.buildServiceRegistry();

		SessionFactory factory = configuration.buildSessionFactory(registry);
		Session session = factory.openSession();
		session.beginTransaction();

		// create 
		
		for (int i = 0; i < 10; i++) {
			CRUD_UserDetails crud_UserDetails = new CRUD_UserDetails();

			crud_UserDetails.setUserName("User" + i);
			session.save(crud_UserDetails);

		}
		
		session.getTransaction().commit();
		session.close();
		
		
		session = factory.openSession();
		session.beginTransaction();
		
		
		Query  query=session.createQuery("from CRUD_UserDetails");
		
		List list=query.list();
		
		System.out.println(list.size());
		session.getTransaction().commit();
		session.close();

		
		  
		  
	}

}
