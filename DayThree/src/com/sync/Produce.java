package com.sync;

public class Produce extends Thread{
   CakeFactory c;
   
   Produce(CakeFactory c){
	   this.c=c;
	   start();
   }
   
   public void run(){
	   while(true){
	   c.produce();
	   try{
		   sleep(600);
	   }
	   catch(Exception e){
		   
	   }
	   }
   }
}