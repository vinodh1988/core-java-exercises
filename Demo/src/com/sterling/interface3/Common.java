package com.sterling.interface3;

public interface Common {
   public void fun();
   default public void superfun() {
	   System.out.println("Superfun Default");
   }//java 8 feature
   
   static void method() {
	   System.out.println("Common static");
   }
}
