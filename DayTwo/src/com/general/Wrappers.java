package com.general;

public class Wrappers {
	
	public static void main(String arn[]) {
		
		Integer x= new Integer(30);
		Integer y= new Integer(30);
		
		int a=x;
		int b=y;
		
		Integer p=a;
		Integer q=b;
		
		Integer m=x;
		Integer n=y;
		
		System.out.println(x==y); //reference will be compared
		System.out.println(a==b);// values will compared
		System.out.println(a==x);//values will be compared
		System.out.println(b==y);//values will be compared
		System.out.println(p==q); //reference will compared
		System.out.println(m==n); //references will be compared
		/*int a=20;
	
		Integer i=a; //auto boxing
		Integer obj=new Integer(a);
		
		int x=i; //unboxing
		
		System.out.println(x+" "+i+" " +obj);*/
		
		
		
		
	}

}

/*
   Integer
   Byte
   Short
   Long
   
   Double
   Float
   
   Character
   
   Boolean



*/