package com.hibernate.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.hibernate.dto.CRUD_UserDetails;

public class ParameterBinding_SQLInjection {

		// TODO Auto-generated method stub
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
			
		
		String userId = "5";
		String userName = "User6";
		Query query1 = session.createQuery(" from CRUD_UserDetails where userId > ? and userName = ?");
		query1.setInteger(0, Integer.parseInt(userId));
		query1.setString(1, userName);
						
			String userId1="5";
			String userName1="User6";
			Query  query2=session.createQuery(" from CRUD_UserDetails where userId > :userId1 "
					+ "and userName = :userName1");
			query2.setInteger("userId1",Integer.parseInt(userId));
			query2.setString("userName1", userName);
			
			
			List<CRUD_UserDetails> list1=query2.list();
			
			for(CRUD_UserDetails crud :list1) {
				System.out.println(crud.getUserName());
			}
			
			System.out.println(list1.size());
			session.getTransaction().commit();
			session.close();			
		}

}
