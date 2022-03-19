package com.collections;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {
   public static void main(String[] args) {
	   
	   Set<String> set=new TreeSet<String>();
	   
	   set.add("Raj");
	   set.add("Arun");
	   set.add("Aravind");
	   set.add("Jay");
	   set.add("Bhargav");
	   set.add("Arun");
	   
	   
	   System.out.println(set);
	
  }
}
