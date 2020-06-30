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

public class Criteria {

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
				//// create instance of entity class
				CRUD_UserDetails crud_UserDetails = new CRUD_UserDetails();
				// filled the attributes

				//crud_UserDetails.setUserId(5);
				crud_UserDetails.setUserName("User%");
				
				//Making a example out of instance
				Example example=Example.create(crud_UserDetails).enableLike();
				
		        org.hibernate.Criteria criteria = session.createCriteria(CRUD_UserDetails.class).add(example);
				//.setProjection(Projections.max("userId"));
				// .addOrder(Order.desc("userId"))
				
		List<CRUD_UserDetails> list1 = criteria.list();

		System.out.println(list1.size());
		for (CRUD_UserDetails crud : list1) {
			System.out.println(crud.getUserId());
		}

		/*
		 * Query query1=session.getNamedQuery("CRUD_UserDetails.byName");
		 * query1.setInteger(0, 5);
		 * 
		 * List<CRUD_UserDetails> list=query1.list();
		 * 
		 * for(CRUD_UserDetails crud :list) { System.out.println(crud.getUserName()); }
		 */
				
				
				session.getTransaction().commit();
				session.close();			
			}

}
