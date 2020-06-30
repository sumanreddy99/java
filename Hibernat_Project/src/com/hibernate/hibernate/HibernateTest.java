package com.hibernate.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.hibernate.dto.Address;
import com.hibernate.dto.School;
import com.hibernate.dto.Student;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student = new Student();
		//	student.setStudentId(1);
			student.setStudentName("first User");
			student.setJoindate(new Date());
			student.setDescription("description");
			
		School school=new School();
		school.setSname("SS");
		
		student.getSchool().add(school);
		
		School school1=new School();
		school1.setSname("SS1");
		
		student.getSchool().add(school1);
		
		school.getStudent().add(student);
		school1.getStudent().add(student);
		//school.setStudent(student);
		//school1.setStudent(student);
		/*
		 * Address adr=new Address(); adr.setCity("che"); adr.setState("tn");
		 * adr.setStreet("perun"); adr.setPinCode("600096");
		 * 
		 * Address adr1=new Address(); adr1.setCity("TS"); adr1.setState("TS");
		 * adr1.setStreet("KU"); adr1.setPinCode("506009");
		 */
		
		
		//Student student1 = new Student();
		//	student.setStudentId(1);
		/*
		 * student.setStudentName("second User"); student.setJoindate(new Date());
		 * student.setDescription("second description");
		 */
		/*
		 * student.getAddr().add(adr); student.getAddr().add(adr1);
		 *//*
		 * Student student1 = new Student(); // student.setStudentId(1);
		 * student1.setStudentName("second User"); student1.setAddress(adr);
		 * student1.setJoindate(new Date()); student1.setDescription("new description");
		 */

		// create session factory object

		Configuration configuration = new Configuration().configure();

		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
				.buildServiceRegistry();
        // one session factory object per class
		SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);
       // SessionFactory factory=configuration.configure().buildSessionFactory();
		
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(student);
		//session.save(student1);
		session.save(school);
		session.save(school1);
		session.getTransaction().commit();
		session.close();
		/*
		 * student=null;
		 * 
		 * session=factory.openSession(); student=(Student)session.get(Student.class,
		 * 1); session.close();
		 */
		
		//System.out.println("Student Details"+student.getAddr());
		
		
		
		
		

	}

}
