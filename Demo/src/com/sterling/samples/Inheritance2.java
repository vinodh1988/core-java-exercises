package com.sterling.samples;

/*
 * 
 *    for a super class reference you can point sub class object
 *    but for a sub class reference you cannot point super class object
 */
public class Inheritance2 {
	
	public static void main(String[] args) {
		 Super obj=new Sub();
		 obj.method1();
		 obj.show();
		 
		 
		 
	}

}
