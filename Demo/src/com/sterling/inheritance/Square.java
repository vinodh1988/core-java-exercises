package com.sterling.inheritance;

public class Square extends Shape{
  private int side;
  
  public Square() {
  }
  
  public Square(String name,int noOfSides,int side) {
	  super(name,noOfSides);
	  this.side=side;
  }
  public void show() {
	  super.show();
	  System.out.println("Sides "+side);
  }
  
  public void area() {
	  System.out.println("Area is "+(side*side));
  }
}
