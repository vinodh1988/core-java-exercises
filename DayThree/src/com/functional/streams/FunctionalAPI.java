package com.functional.streams;

public class FunctionalAPI {
  public static void main(String[] args) {
	   //calling Function type
	  
	   /* Processor.process((x)->{
	    	System.out.println("My logic is processing "+x);
	    	return "World!! World!!! World!!!";
	    }, "India");*/
	  
	/*  Processor.process2((x->{
		  System.out.println("Received and processing "+x);
	  }), "India");*/
	  
	/*  Processor.process3((x)->{
		  if(x.length()>=5)
			  return true;
		  return false;
	  }, "India");*/
	  
	  Processor.process4(()->{
		  return "India";
	  });
	
   }
}
