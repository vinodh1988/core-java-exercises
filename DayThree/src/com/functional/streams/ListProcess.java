package com.functional.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListProcess {
   public static void main(String[] args) {
	 
                 List<Integer> list = Arrays.asList(1,2,3,5,34,534,24,23,34,34,23,135,235,54,346);
               
                 System.out.println(list);
                 
           List<Integer> list2 = 
                list.stream().filter(x->x%2==0?true:false).collect(Collectors.toList());
           
                System.out.println(list2);
                
              list2 = 
                        list.stream().filter(x->x>300?true:false).collect(Collectors.toList());
              System.out.println(list2);
              
           list2 =  list.stream().map(x->{
            	if(x%2==0)
            		return x;
            	else
            		return x*2;
            }).collect(Collectors.toList());
           
           System.out.println(list2);
                 
    }
}
