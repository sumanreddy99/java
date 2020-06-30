package com.java.programs;

import java.util.Scanner;

class Point2D{
	int x,y;
	public Point2D(int x,int y){
		this.x=x;
		this.y=y;
		
	}
	public double dist2D(Point2D p){
		double distance = Math.sqrt(Math.pow((p.x-x), 2)+Math.pow((p.y-y), 2));
		return distance;
	}
	
	public void  printDistance(double d){
		System.out.println("point 2d"+Math.ceil(d));
		
	}
}

 class Point3D extends Point2D{
	int z;
	public Point3D(int x,int y,int z){
		super(x,y);
		this.z=z;
	}
	public double dist3D(Point3D p){
		double distance=Math.sqrt(Math.pow((p.x-x), 2)+Math.pow((p.y-y), 2)+Math.pow((p.z-z),2));
	return distance;
	}
	public void printDistance(double d){
		System.out.println("3D Point"+Math.ceil(d));
	}
}

public class DistanceBetweenTwoPoints {


		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int x1 = scanner.nextInt();
			int y1 = scanner.nextInt();
			int z1 = scanner.nextInt();
			int x2 = scanner.nextInt();
			int y2 = scanner.nextInt();
			int z2 = scanner.nextInt();
	        scanner.close();
	        
			Point3D p1 = new Point3D(x1, y1, z1);
			Point3D p2 = new Point3D(x2, y2, z2);
			double d2 = p1.dist2D(p2);
			double d3 = p1.dist3D(p2);
	        // The code below uses runtime polymorphism to call the overridden printDistance method:
	        Point2D p = new Point2D(0, 0);
			p.printDistance(d2);
			p = p1;
			p.printDistance(d3);
		}
	}

	

