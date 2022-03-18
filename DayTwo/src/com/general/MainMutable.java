package com.general;

public class MainMutable {
     public static void main(String[] args) {
		Mutable m=new Mutable(3);
		
		m.show();
		m.change(34);
		m.show();
		
		String x="Raj";
		String y=x.concat(" Kumar");
		System.out.println(x);
		System.out.println(y);
		
		StringBuffer s1=new StringBuffer("Raj");
		System.out.println(s1);
		s1.append(" Kumar");
		System.out.println(s1);
	}
     
     
}
