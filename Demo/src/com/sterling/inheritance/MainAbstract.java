package com.sterling.inheritance;

public class MainAbstract {
  public static void main(String[] args) {
	  Abst obj=new Abst() {};
	  obj.show();
	  
	  AbstOne obj1=new AbstOne() {
		  public void say() {
			  System.out.println("SAY Hi");
		  }
	  };
	  obj1.show();obj1.say();
  }
}
