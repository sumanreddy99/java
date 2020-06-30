package com.seleniumexpress.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalculatorApplicationInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
       System.out.println("spring mvc project");
		/*
		 * XmlWebApplicationContext applicationContext=new XmlWebApplicationContext();
		 * 
		 * applicationContext.setConfigLocation("classpath:application-config.xml");
		 */
       
       AnnotationConfigWebApplicationContext applicationContext=new AnnotationConfigWebApplicationContext();
       
       applicationContext.register(LCApplicationConfiguration.class);
       
       //create dispatch servlet object
       DispatcherServlet dispatcherServlet=new DispatcherServlet(applicationContext);
       
       // register dispatch servlet to servletContext
       
       ServletRegistration.Dynamic myCustomRegistration= servletContext.addServlet("homefrontcontroller",dispatcherServlet);
       
       myCustomRegistration.setLoadOnStartup(1);
       myCustomRegistration.addMapping("/Home/*");
       
	}

}
