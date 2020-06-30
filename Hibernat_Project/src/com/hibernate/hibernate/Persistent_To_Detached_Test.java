package com.hibernate.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.hibernate.dto.CRUD_UserDetails;
import com.hibernate.dto.FourWheeler;
import com.hibernate.dto.Persistent_To_Detached_UserDetails;
import com.hibernate.dto.TwoWheeler;
import com.hibernate.dto.Vechile;

public class Persistent_To_Detached_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persistent_To_Detached_UserDetails  persistent_To_Detached_UserDetails= new Persistent_To_Detached_UserDetails();
		Configuration configuration = new Configuration().configure();

		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
				.buildServiceRegistry();

		SessionFactory factory = configuration.buildSessionFactory(registry);
		Session session = factory.openSession();
		session.beginTransaction();

		
		  // create
		  
		  persistent_To_Detached_UserDetails.setUserName("User");
		  session.save(persistent_To_Detached_UserDetails);
		  
		  session.getTransaction().commit(); session.close();
		 
		//retrieve
		 session = factory.openSession();
		session.beginTransaction();
		Persistent_To_Detached_UserDetails persistent_To_Detached_UserDetails1=(Persistent_To_Detached_UserDetails)session.get(Persistent_To_Detached_UserDetails.class, 1);
		session.getTransaction().commit();
		session.close();
				
		//  update
		  
		
		 // persistent_To_Detached_UserDetails1.setUserName("user update");
		  
		session = factory.openSession();
		session.beginTransaction();

		session.update(persistent_To_Detached_UserDetails1); //

		session.getTransaction().commit();
		session.close();
		 
		

	}

}
