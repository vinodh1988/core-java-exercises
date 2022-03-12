package com.sterling.lambda;

public class Anonymous {
  public static void main(String[] args) {
	  //way no 1
	   class Spot implements Task{

		@Override
		public void activity() {
			// TODO Auto-generated method stub
		  System.out.println("Spot activity")	;
		}
		   
	   }//local class
	   Task t=new Spot();
	   t.activity();
	   //way 2
	   t =new Task() {

		@Override
		public void activity() {
			// TODO Auto-generated method stub
			System.out.println("Anonymous activity");
		}
		   
	   };
	   
	   t.activity();
	   
	   //way 3
	   
	   t=()->{
		  System.out.println("Lambda task"); 
	   };
	   
	   t.activity();
	   
	  Task t1=()->{
		   System.out.println("Funny lambda task");
	   };
	   t1.activity();
  }
}
