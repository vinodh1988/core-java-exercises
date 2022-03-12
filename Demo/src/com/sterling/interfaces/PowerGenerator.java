package com.sterling.interfaces;

public class PowerGenerator implements Fuel{
   public void generate() {
	   System.out.println("Generating power");
   }

@Override
public void fillFuel() {
	// TODO Auto-generated method stub
	System.out.println("Generator filled with fuel");
}
}
