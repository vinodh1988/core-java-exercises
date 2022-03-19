package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetDemo {
public static void main(String[] args) {
    Set<Integer> set=new HashSet<Integer>();
    Set<String> strings=new HashSet<String>();
	
    strings.add("Raj"); strings.add(new String("Raj")); strings.add(new String("Raj"));
   
    System.out.println(strings);
    
  
    
	set.add(34);
	set.add(34);
    set.add(null);
    set.add(534);
    set.add(359);
    set.add(43);
    set.add(248);
    
    for(Integer x:set)
    	System.out.println(x);
    
    Iterator<Integer> it=set.iterator();
    while(it.hasNext())
    	System.out.println("Element is "+it.next());
    
    System.out.println(set);
    
    List<String> list=new ArrayList<String>();
	list.addAll(strings);
	System.out.println(list);
}
	

}

/*

Set -Interface 


       Set is Generic
       Set is unordered
       Set cannot have duplicates
       Set will allow one null element
       Elements are not indexed
       
     Implementations
     
     HashSet
     
         Same points above applicable
         
  SortedSet -interface which extends Set
  
   Implementations
   
      TreeSet
       
         Same rules as Hashset
         But Elements are sorted
         Null values are not allowed
  

*/