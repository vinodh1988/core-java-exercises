package com.sterling.samples;


public class InstanceDemo {
   public static void main(String[] args) {
	    
	   Sample s=new Sample();
	   Sample s1=new Sample();
	   Sample s3=new Sample();
	   new Sample().show("noname");
	   Sample s4=s;
	   Sample s5=s;
	   s3=s;
	  
	   s.show("s");
	   s1.show("S1");
	   s3.show("S3");
	   s4.show("S4");
	   s5.show("S5");
	   
	   System.gc();
    }
}



/*
 * 
 *  Java has four access specifiers
 *  
 *      private
 *      protected
 *      public
 *      default - not  a keyword, if nothing specified taken as default
 *      
 *    outer classes in java can have only public and default access specifiers
 *    
 *    inner classes can have any access specifier
 *    
 *    in a file, only one public class is allowed
 *    
 *    it a rule that the name of the file should be same as that of the public class
 */