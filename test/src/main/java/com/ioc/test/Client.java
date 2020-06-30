package com.ioc.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.pojo.TestBean;

/**
 * Hello world!
 *
 */
public class Client 
{
    public static void main( String[] args ) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
    {
    	//Resource resource=(Resource) new ClassPathResource("resources/spring.xml");
		/*
		 * ApplicationContext beanFactory=new
		 * ClassPathXmlApplicationContext("resources/spring.xml");
		 * beanFactory.getBean("t");
		 */
    	
		/*
		 * Class c=Class.forName("com.ioc.pojo.TestBean"); Constructor[]
		 * con=c.getDeclaredConstructors(); con[0].setAccessible(true);
		 * con[0].newInstance();
		 */
    	
    	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resources/spring.xml");
    	TestBean t=(TestBean) applicationContext.getBean("t");
    	t.printData();
    	 System.out.println( "Hello World!" );
    	  
    }
}
