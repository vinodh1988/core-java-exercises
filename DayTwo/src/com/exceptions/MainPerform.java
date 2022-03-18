package com.exceptions;

public class MainPerform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
		LogicalProgram.perform(20);
	} catch (DataException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
