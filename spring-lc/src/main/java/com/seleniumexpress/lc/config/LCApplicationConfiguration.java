package com.seleniumexpress.lc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.seleniumexpress.lc.controller")
public class LCApplicationConfiguration {
	
@Bean	
InternalResourceViewResolver	viewResolver() {
	
	InternalResourceViewResolver resolver=new InternalResourceViewResolver();
	resolver.setPrefix("/WEB-INF/view/");
	resolver.setSuffix(".jsp");
	return resolver;
}


}
