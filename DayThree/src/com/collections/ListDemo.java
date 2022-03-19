package com.collections;

import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		//System.out.println(LocalTime.now());
		List<String> list=new LinkedList<String>();
		list.add("Raj");
		list.add("Ravi");
		list.add("Peterson");
		list.add("Jackson");
		list.add("Nicholas");
		list.add("Watson");
		list.add("James");
		list.add("James");
		list.add("Watson");
		list.add("Jack");
		list.add(null);
		list.add(null);
		list.add("Faizal");


		System.out.println(list);
		//System.out.println(LocalTime.now());
		list.add(3,"Mustafa");
		
		System.out.println(list);
		list.remove(5);
		System.out.println(list);
		
	     for(String x:list)
	    	 System.out.println(x);
	     
	     for(int x=0;x<list.size();x++)
	    	 System.out.print(list.get(x)+" ");
	}

}


/*
    Collection Framework 
    
    Stack
    Queue
    List
    Set
    Map
    
    this framework is part of jdk  in the package java.util
    
    All collections of generic
    List
    Set
    and Map
    
    List -
  
    List  -interface
     
       - it is a linear collection of elements
       - it can ba accessed randomly using index
       - you can insert update delete based on index
       - elements are ordered in the ordered you insert
       - supports duplicates
       - support null values [ n times]
       
    ArrayList and LinkedList are very popular implementations
    
    ArrayList is implemented by using Array , hence random insertion and deletion will take time, it has
    to readjust the elements
    
    Linked list is implement by using Double linked list concept
    
    but read operations are extremely fast because we read using index
    
    but Linked list read operations depends on what index you read if its is a random or middle element
    could be slower because it has to go throught every element to find the link and reach the element
    
    Wrie operations mostly it would faster in linked list because we are just going to join the elements
    with the links
       
       
    

*/