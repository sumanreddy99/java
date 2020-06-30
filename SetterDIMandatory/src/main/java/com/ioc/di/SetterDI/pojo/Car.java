package com.ioc.di.SetterDI.pojo;

/**
 * Hello world!
 *
 */
public class Car 
{
   private String carNames;
   
   private Engine  engine;
   
   
   public void setCarNames(String carNames) {
	this.carNames = carNames;
}
   
   public void setEngine(Engine engine) {
	this.engine = engine;
}
   
   public void printData() {
	// TODO Auto-generated method stub
   System.out.println("car" + carNames);
   System.out.println("Engine"+engine.getModalYear());
}
}
