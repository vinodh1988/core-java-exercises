package com.sterling.interfaces;

import java.util.Scanner;

public class FuelProcessor {
    public static void main(String n[]) {
    	System.out.println("Which one you want to fill fuel c for car, v for van, b for bus,"
    			+ " m for machine, p for power Generator");
    	
    	Scanner sc=new Scanner(System.in);
    	
    	String choice=sc.next();
    	
    	Fuel f=null;
    	
    	switch(choice) {
    	case "c":
    		   f=new Car();
    		   break;
    	case "v":
    		   f=new Van();
               break;
    	case "b":
    		   f=new Bus();
    		   break;
    	case "m":
    		   f=new Machinery();
    		   break;
    	case "p":
    		   f=new PowerGenerator();
    		   break;
    		   
    	}
    	
    	f.fillFuel();
    }
}
