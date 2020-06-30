package com.hibernate.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.hibernate.dto.FourWheeler;
import com.hibernate.dto.TwoWheeler;
import com.hibernate.dto.UserDetails;
import com.hibernate.dto.Vechile;

public class Inheritence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vechile vechile = new Vechile();
		vechile.setVechileName("car");

		TwoWheeler twoWheeler = new TwoWheeler();
		twoWheeler.setHandle("bike");
		twoWheeler.setVechileName("honda");

		FourWheeler fourWheeler = new FourWheeler();
		fourWheeler.setWheel("wheel");
		fourWheeler.setVechileName("benz");
		

		Configuration configuration = new Configuration().configure();

		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
				.buildServiceRegistry();

		SessionFactory factory = configuration.buildSessionFactory(registry);
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(vechile);
		session.save(twoWheeler);
		session.save(fourWheeler);
		session.getTransaction().commit();
		session.close();
	}
}
