package com.hibernate.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.hibernate.dto.CRUD_UserDetails;

public class Query_Cache_Test {

	// TODO Auto-generated method stub
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Configuration configuration = new Configuration().configure();

				ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
						.buildServiceRegistry();

				SessionFactory factory = configuration.buildSessionFactory(registry);
				Session session = factory.openSession();
				session.beginTransaction();
				Query query=session.createQuery(" from CRUD_UserDetails user where user.userId=3");
				query.setCacheable(true);// fetch data from database
				List crud_UserDetails=query.list();
				
				session.getTransaction().commit();
				session.close();	
				
				Session session1 = factory.openSession();
				session1.beginTransaction();
				
                Query query1=session.createQuery(" from CRUD_UserDetails user where user.userId=3");
                query.setCacheable(true);// fetch data from query cahce not from data base 
				List crud_UserDetails1=query1.list();
				
				session1.getTransaction().commit();
				session1.close();	
				
			}

}
