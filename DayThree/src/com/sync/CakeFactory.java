package com.sync;

import java.util.ArrayList;
import java.util.List;

public class CakeFactory {
   private int stock;
   List<Integer> l=new ArrayList<Integer>();
   int current;
   boolean status=false;
   public synchronized void produce(){
	 
		   int temp=(int)Math.round(Math.random()*20)+1;
	    
		   System.out.println(temp+ " Cakes produced");
		   stock+=temp;
		   System.out.println(stock+" Cakes available");
	   if(stock>=current&&status)
	   {
		   
		   notify();
		   
	   }
	   
   }
   
   public synchronized void order(){
	   
	   if(l.size()>=10)
		try {
			System.out.println("Cant take orders until few orders dispatched");
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   int n=(int)Math.round(Math.random())*10+1;
	   System.out.println(n+" Orders taken");
	   l.add(n);
   }
   
   public synchronized void dispatch(){
	   if(l.size()>0){
	   current=l.get(0);
	   if(current>stock){
		   status=true;
		   System.out.println(current+" cakes needed , need to wait until produced");
		   try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	   stock-=current;
	   System.out.println(current+" Cakes dispatched");
	   
	   l.remove(0);
	   status=false;
	   if(l.size()>=9)
	   {
		   System.out.println("Can start taking orders.....");
		   notify();
	   }
	   }
   }
}