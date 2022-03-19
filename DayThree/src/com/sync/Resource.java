package com.sync;

public class Resource {
    public static String resource="Open";
    
    public synchronized void useMe(String thread,int sleeptime) {
    	System.out.println(thread + "Task started going to use the resource and its status is"+resource);
    	resource="blocked";
    	System.out.println(thread + " Working with the resource it will take some time");
    	for(int i=0;i<20;i++) {
			try {
				Thread.sleep(sleeptime);
				System.out.println(thread+"  iterating "+i+" status "+ resource);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	resource="Open";
    }
}
