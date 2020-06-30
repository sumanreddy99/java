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

public class Transient_Persistent_Detached {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 CRUD_UserDetails crud_UserDetails = new
				  CRUD_UserDetails();
		 crud_UserDetails.setUserName("ser name");
		
		Configuration configuration = new Configuration().configure();

		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
				.buildServiceRegistry();

		SessionFactory factory = configuration.buildSessionFactory(registry);
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(crud_UserDetails);
		
		  
		  

		session.getTransaction().commit();
		
		session.close();

	}

}
