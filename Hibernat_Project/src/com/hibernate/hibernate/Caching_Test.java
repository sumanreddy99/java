package com.hibernate.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.hibernate.dto.CRUD_UserDetails;

public class Caching_Test {

	// TODO Auto-generated method stub
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Configuration configuration = new Configuration().configure();

				ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
						.buildServiceRegistry();

				SessionFactory factory = configuration.buildSessionFactory(registry);
				Session session = factory.openSession();
				session.beginTransaction();
				CRUD_UserDetails crud_UserDetails = (CRUD_UserDetails) session.get(CRUD_UserDetails.class, 1);
				
				session.getTransaction().commit();
				session.close();	
				
				Session session1 = factory.openSession();
				session1.beginTransaction();
				
               CRUD_UserDetails crud_UserDetails1 = (CRUD_UserDetails) session1.get(CRUD_UserDetails.class, 1);
				
				session1.getTransaction().commit();
				session1.close();	
				
			}

}
