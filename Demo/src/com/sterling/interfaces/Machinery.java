package com.sterling.interfaces;

public class Machinery implements Fuel{
   public void produce() {
	   System.out.println("Machine producing products");
   }

@Override
public void fillFuel() {
	// TODO Auto-generated method stub
	System.out.println("Machine filled with fuel");
}
}
