package com.sterling.interfaces;

abstract public class Vehicle implements Fuel{
private String name;
   public Vehicle(String name){
	   this.name=name;
   }
   abstract void method();
   
   public void show() {
	   System.out.println("Vehicle is "+name);
   }
}
