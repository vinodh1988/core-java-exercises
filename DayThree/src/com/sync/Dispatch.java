package com.sync;

public class Dispatch extends Thread {
	CakeFactory c;
	   
	   Dispatch(CakeFactory c){
		   this.c=c;
		   start();
	   }
	   
	   public void run(){
		   while(true){
		   c.dispatch();
		   try{
			   sleep(150);
		   }
		   catch(Exception e){
			   
		   }
		   }
	   }
}