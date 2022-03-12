package com.sterling.inheritance;
//object for this class is not possible, only reference is possible
abstract public class Shape {
    private String name;
    private int noOfSides;
    
    public Shape() {}
    public Shape(String name, int noOfSides) {
    	this.name=name;
    	this.noOfSides=noOfSides;
    }
    
    public void show() {
    	System.out.println("Name:: "+name);
    	System.out.println("No of Sides:: " +noOfSides);
    }
    
   abstract public void area(); //method without definition
}
