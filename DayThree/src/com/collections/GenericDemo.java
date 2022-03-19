package com.collections;

public class GenericDemo {
   public static void main(String[] args) {
	   Generic<Integer> g=new Generic<Integer>(35);
	   g.setData(34);
	   g.display();
	   g.setData(53);
	   g.display();
	   
	   Generic<String> g1=new Generic<String>("Rajan");
	   
	   g1.display();
	   g1.setData("Hari");
	   g1.display();
	 
}
}
