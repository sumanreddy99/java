package com.java.programs;

import java.util.Scanner;


class Shape {
    public void drawShape() {
       System.out.println("Drawing a Shape");
    }
}



/*
 * Create the Circle, Square, Rectangle and ShapeFactory class.
 */
 class Circle extends Shape{
    public void drawShape() {
        System.out.println("Drawing a Circle");
    }
 }
 
class Square extends Shape {
    public void drawShape() {
        System.out.println("Drawing a Square");
    }
}

class Rectangle extends Shape {
    public void drawShape() {
        System.out.println("Drawing a Rectangle");
    }
}
class ShapeFactory extends Shape{
    Shape s;
    public void drawShape(String ip) {
        if(ip.equalsIgnoreCase("circle")){
            s = new Circle();
            s.drawShape();
        }else if (ip.equalsIgnoreCase("Square")) {
            s = new Square();
            s.drawShape();
        } else if(ip.equalsIgnoreCase("Rectangle")){
            s = new Rectangle();
            s.drawShape();
        }else {
            System.out.println("Drawing "+ip+" is not supported");
        }
        
    }
}


public class DrawShape {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        
        ((Shape)circle).drawShape();
        ((Shape)square).drawShape();
        ((Shape)rectangle).drawShape();
        
        System.out.println();
        
        ShapeFactory factory = new ShapeFactory();
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for (int i = 0; i < n; i++) {
            String type = in.next();
            factory.drawShape(type);    
        }
    }
}