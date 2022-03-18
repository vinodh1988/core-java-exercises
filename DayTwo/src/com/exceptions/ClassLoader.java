package com.exceptions;

public class ClassLoader {
    public static void classLoader(String classname) throws ClassNotFoundException {
     try {
    	Class.forName(classname);
   
      }
      catch(ClassNotFoundException e) {
    	 System.out.println("We stored it in our personal log");
    	 throw e;
      }
    }
}
