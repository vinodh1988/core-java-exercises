package com.sterling.interfaces;

public class Van implements Fuel {
	  public void vanMethod() {
	    	System.out.println("Van's own method");
	    }

	@Override
	public void fillFuel() {
		// TODO Auto-generated method stub
		System.out.println("Van filled with fuel");
	}
}
