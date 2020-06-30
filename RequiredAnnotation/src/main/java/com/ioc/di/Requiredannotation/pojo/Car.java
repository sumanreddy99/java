package com.ioc.di.Requiredannotation.pojo;

import org.springframework.beans.factory.annotation.Required;

/**
 * Hello world!
 *
 */
public class Car 
{
   private String carNames;
   
   private String  engine;
   
   private String price;
   
   @Required
   public void setCarNames(String carNames) {
	this.carNames = carNames;
}
   
   public void setEngine(String engine) {
	this.engine = engine;
}
   
   public void setPrice(String price) {
	this.price = price;
}
  
   
   public void printData() {
	// TODO Auto-generated method stub
   System.out.println("car" + carNames);
   System.out.println("Engine"+engine);
   
   }
}
