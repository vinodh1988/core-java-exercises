package com.general;

public class StringDemo {
   public static  void main(String n[]) {
	   String x="Rahul";
	   String y=new String("Rahul");
	   String z="Rahul";
	   String m=new String("Rahul");
	   
	   System.out.println(x==y);
	   System.out.println(x==z);
	   System.out.println(y==m);
	   
	   System.out.println("Rahul".hashCode());
	   System.out.println(x.hashCode());
	   System.out.println(y.hashCode());
	   
	   System.out.println(x.equals(y));
	   System.out.println(x.equals(z));
	   System.out.println(y.equals(m));
	   
;   }
} 
