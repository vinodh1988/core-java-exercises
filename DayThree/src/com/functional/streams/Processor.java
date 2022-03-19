package com.functional.streams;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Processor {

	  public static void process(Function<String,String> f,String x) {
		 String result= f.apply(x);
		 System.out.println("Processor is processing your result"+result);
	  }
	  
      public static void process2(Consumer<String> f,String x) {
		  System.out.println("Processor wants you to consume "+x);
		  f.accept(x);
	  }
      
      public static void process3(Predicate<String> f,String x) {
		  Boolean result =f.test(x);
		  if(result)
			   System.out.println("Processor True");
		  else
			   System.out.println("Processor false");
	  }
      
     public static void process4(Supplier<String> f) {
		  String p=f.get();
		  System.out.println("Processor received "+p);
	  }
 
}
