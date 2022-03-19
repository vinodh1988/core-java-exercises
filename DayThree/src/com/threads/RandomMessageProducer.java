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
    public int rounds;
    
    RandomMessageProducer(String name,int sleeptime,int rounds){
    	super(name);
    	this.sleeptime = sleeptime;
    	this.rounds=rounds;
    }
    
    @Override
    public void run() {
    	int x=1;
    	  while(x<rounds) {
    		  String temp=messages[(int)Math.round(Math.random()*6)];
    		  System.out.println(getName()+" Thread generated \" "+temp+" \"  message");
    		  try {
				sleep(sleeptime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		  x++;
    	  }
    }
}
