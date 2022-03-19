package com.collections;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo2 {
    public static void main(String[] args) {
		Set<Emp> e=new TreeSet<Emp>();
		e.add(new Emp(3,"Raj","Chennai"));
		e.add(new Emp(1,"Ravi","Chennai"));
		e.add(new Emp(2,"Shaun","Chennai"));
		
		System.out.println(e);
	}
}
