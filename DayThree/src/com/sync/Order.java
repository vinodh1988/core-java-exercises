package com.sync;

public class Order extends Thread {
	CakeFactory c;
	   
	   Order(CakeFactory c){
		   this.c=c;
		   start();
	   }
	   
	   public void run(){
		   while(true){
		   c.order();
		   try{
			   sleep(200);
		   }
		   catch(Exception e){
			   
		   }
		   }
	   }
}