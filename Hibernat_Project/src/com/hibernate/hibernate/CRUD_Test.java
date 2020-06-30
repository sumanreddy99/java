package com.hibernate.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.hibernate.dto.CRUD_UserDetails;
import com.hibernate.dto.FourWheeler;
import com.hibernate.dto.TwoWheeler;
import com.hibernate.dto.Vechile;

public class CRUD_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration configuration = new Configuration().configure();

		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
				.buildServiceRegistry();

		SessionFactory factory = configuration.buildSessionFactory(registry);
		Session session = factory.openSession();
		session.beginTransaction();

		// create 
		
		  for (int i = 0; i < 10; i++) { CRUD_UserDetails crud_UserDetails = new
		  CRUD_UserDetails();
		  
		  crud_UserDetails.setUserName("User" + i); session.save(crud_UserDetails);
		  
		  }
		  
		  
//retrieve
		
		
		  CRUD_UserDetails crud_UserDetails=(CRUD_UserDetails)
		  session.get(CRUD_UserDetails.class,5);
		  
		  System.out.println("user "+crud_UserDetails.getUserName());
		 	 
		//update
		
		  CRUD_UserDetails crud_UserDetails1=(CRUD_UserDetails)
		  session.get(CRUD_UserDetails.class,5);
		  crud_UserDetails1.setUserName("user update");
		  System.out.println("user "+crud_UserDetails.getUserName()+" "+crud_UserDetails.getUserId());
		  session.update(crud_UserDetails1);
		  
		 
		  //delete
		CRUD_UserDetails crud_UserDetails2 = (CRUD_UserDetails) session.get(CRUD_UserDetails.class, 5);

		session.delete(crud_UserDetails2);
		session.getTransaction().commit();
		
		session.close();

	}

}
