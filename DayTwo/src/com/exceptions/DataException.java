package com.exceptions;

public class DataException extends Exception {
    @Override
    public void printStackTrace() {
    	// TODO Auto-generated method stub
    	super.printStackTrace();
    	System.out.println("Data is not appropriate");
    }
    
    @Override
    public String getMessage() {
    	// TODO Auto-generated method stub
    	return "Data must be greater than 5000";
    }
    
    
}
