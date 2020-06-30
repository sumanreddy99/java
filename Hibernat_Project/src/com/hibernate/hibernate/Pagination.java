package com.hibernate.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.hibernate.dto.CRUD_UserDetails;

public class Pagination {

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
		
		
		Query  query=session.createQuery(" from CRUD_UserDetails");
		
		query.setFirstResult(2);// at what position record should start
		query.setMaxResults(5);// maximum records per page;
		List<CRUD_UserDetails> list=query.list();
		
		for(CRUD_UserDetails crud :list) {
			System.out.println(crud.getUserName());
		}
		
		System.out.println(list.size());
		session.getTransaction().commit();
		session.close();
		
		session = factory.openSession();
		session.beginTransaction();

		Query  query1=session.createQuery("select userName from CRUD_UserDetails");
		
		query1.setFirstResult(2);// at what position record should start
		query.setMaxResults(5);// maximum records per page;
		List<String> userName=query1.list();
		
		for(String crud :userName) {
			System.out.println(crud);
		}
		
		System.out.println(list.size());
		session.getTransaction().commit();
		session.close();

		
		  
		  
	
	}

}
