package com.sterling.inheritance;

public class Rectangle extends Shape{
   private int length;
   private int breadth;
   
   public Rectangle() {}
   
   public Rectangle(String name,int noOfSides,int length,int breadth) {
	   super(name,noOfSides);
	   this.length=length;
	   this.breadth=breadth;
   }
   
   public void show() {
	super.show();
   	System.out.println("Length :: "+length);
   	System.out.println("Breadth:: " +breadth);
   }
   
   public void area() {
	   System.out.println("Area is "+(length*breadth));
   }
}
