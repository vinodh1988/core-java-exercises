package com.sterling.lambda2;

public class Process {
   public static void doActivity(Activity activity) {
	   System.out.println("Setting up the activity");
	   activity.perform();
	   System.out.println("Clearing the resources");
   }
}
