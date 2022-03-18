package com.exceptions;

public class DeveloperMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          try {
			ClassLoader.classLoader("com.general.Member1");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Developer Log");
		}
	}

}
