package com.hibernate.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.hibernate.dto.UserDetails;
import com.hibernate.dto.Vechile;

public class User_Vechile_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserDetails userDetails=new UserDetails();
	//	userDetails.setUserId(1);
        userDetails.setUserName("firstUser");
        
        
        Vechile vechile=new Vechile();
        //vechile.setVechileId(1);
        vechile.setVechileName("car");
        
        Vechile vechile1=new Vechile();
        //vechile1.setVechileId(2);
        vechile1.setVechileName("jeep");
        
        userDetails.getVechile().add(vechile);
        userDetails.getVechile().add(vechile1);
        
        
        Configuration configuration=new Configuration().configure();
        
        ServiceRegistry registry=new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        
        SessionFactory factory=configuration.buildSessionFactory(registry);
        Session session=factory.openSession();
        session.beginTransaction();
        session.persist(userDetails);
        session.getTransaction().commit();
        session.close();
        
        
	}

}
