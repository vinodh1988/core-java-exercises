package com.sync;

public class MainThread {
   public static void main(String[] args) {
	  Resource r=new Resource();
	  TaskThread t=new TaskThread("First Task",100,r);
	  TaskThread t2=new TaskThread("Second Task",100,r);
	  
   }
}
