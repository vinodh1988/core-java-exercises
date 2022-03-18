package com.general;

public class Member {
   static {
	   System.out.println("Static Block");
   }//runs only once when the class loaded
   
   static {
	   System.out.println("Static Block2");
   }//
   {
	   System.out.println("Local Block");
   }//executes every instance creation before the constructor
   
   public Member(){
	   System.out.println("In the constructor");
   }
   
   public static void callMe() {
	   System.out.println("Call me");
   }
}
