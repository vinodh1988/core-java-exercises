package com.sterling.samples;

public class Sub extends Super{
   private int sub;
   
   public Sub() {
	   
   }
   public Sub(int sub) {
	   super(sub+100); //calling super class constructor explicity from subclass
	                   //it has to be first and should be called only in the constructor
	   this.sub=sub;
   }
   
   public void method2() {
	   System.out.println("Inside method2");
   }
   
   @Override
   public void show() {
	   super.show(); //to call overridden method  of super class
	   System.out.println(sub+ " is the value of sub");
   }
}
