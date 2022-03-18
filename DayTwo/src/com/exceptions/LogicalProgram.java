package com.exceptions;

public class LogicalProgram {
   public static  void perform(int n) throws DataException {
	   if(n>50000)
		   System.out.println("Logical is performed  for input "+n);
	   else
		   throw new DataException();
   }
}
