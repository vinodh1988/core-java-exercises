package com.threads;

public class RandomMessageProducer extends Thread {
    final static String messages[] = {
    		"Java is object oriented",
    		"Java has interfaces",
    		"Java has pritive datatypes",
    		"Java Supports Lambda functions",
    		"Lamda is applicable for only functional interface",
    		"Java does not support multiple inheritance",
    		"Java does not support operator overloading"
    };
    private int sleeptime;
    
    RandomMessageProducer(String name,int sleeptime){
    	super(name);
    	this.sleeptime = sleeptime;
    }
    
    @Override
    public void run() {
    	  while(true) {
    		  String temp=messages[(int)Math.round(Math.random()*6)];
    		  System.out.println(getName()+" Thread generated \" "+temp+" \"  message");
    		  try {
				sleep(sleeptime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	  }
    }
}
