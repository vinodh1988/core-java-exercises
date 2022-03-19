package com.sync;

public class TaskThread extends Thread {
     private int sleeptime;
     Resource resource;
     
     public TaskThread(String name,int sleeptime,Resource resource) {
    	 super(name);
    	 this.sleeptime=sleeptime;
    	 this.resource=resource;
    	 start();
     }
     
     public void run() {
    	 System.out.println(getName()+" Started the Task");
    	 resource.useMe(getName(), sleeptime);
    	 System.out.println(getName()+" Finished the Task");
     }
     
}
