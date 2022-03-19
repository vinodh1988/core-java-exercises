package com.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
        public static void main(String[] args) {
			Map<String,String> map=new HashMap<String,String>();
           // Map<String,String> map=new TreeMap<String,String>();
        	//Map<String,String> map=new Hashtable<String,String>();
			map.put("Raj", null);
			map.put("Ravi", null);
			map.put("Raj", "Ramesh");
			map.put("Harry", "Arun");
			map.put("Ashok", "Arun");
			//map.put(null, "David");
			
			System.out.println(map);
			
			System.out.println(map.get("Harry"));
			
			for(String x:map.keySet()) {
				System.out.println(x+" == "+map.get(x));
			}
		}
}

/*
   Map is key-value pair collection
   
   Key properties
   
               keys are unique
               keys are not ordered
               key can be null [only once]
               
   value properties
   
               values are associated with key
               values can have duplicates
               values can be null [n  times]
               
     Implementations
     
     HashMap
     
                same rules mentioned above
                
     TreeMap implements SortedMap
     
             Key properties
                       same as hash map 
                       but no null key and elements are sorted and hence need to be comparable
                       
             Value properties
             
                        Same as Hashmap
                        
        Hashtable
        
                     Same as Hashmap
                     
                     but neither null key nor null value not allowed
*/