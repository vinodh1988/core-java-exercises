package com.sterling.interfaces;

import java.util.Scanner;

public class FuelProcessor {
    public static void main(String n[]) {
    	System.out.println("Which one you want to fill fuel c for car, v for van, b for bus,"
    			+ " m for machine, p for power Generator");
    	
    	Scanner sc=new Scanner(System.in);
    	
    	String choice=sc.next();
    	
    	Fuel f=null;
    	Vehicle v=null;
    	
    	switch(choice) {
    	case "c":
    		   v=new Car();
    		   f=v;
    		   break;
    	case "v":
    		   v=new Van();
    		   f=v;
               break;
    	case "b":
    		   v=new Bus();
    		   f=v;
    		   break;
    	case "m":
    		   f=new Machinery();
    		   break;
    	case "p":
    		   f=new PowerGenerator();
    		   break;
    		   
    	}
    	
    	
    	if(v!=null)
    	{
    		v.fillFuel();
    		v.method();
    		v.show();
    	}
    	else
    		f.fillFuel();
    }
}
