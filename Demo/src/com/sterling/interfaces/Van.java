package com.sterling.interfaces;

public class Van extends Vehicle implements Fuel {
	
	  Van(){
		  super("van");
	  }
	  public void method() {
	    	System.out.println("Van's own method");
	    }

	@Override
	public void fillFuel() {
		// TODO Auto-generated method stub
		System.out.println("Van filled with fuel");
	}
}
