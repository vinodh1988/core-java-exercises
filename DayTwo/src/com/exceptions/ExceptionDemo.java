package com.exceptions;

public class ExceptionDemo {
	  public static void main(String n[])  {
		try { 
		  int x=Integer.parseInt(n[1])/Integer.parseInt(n[2]);
		  Class.forName("com.exceptions.ExceptionDemo");
		  System.out.println(n[0]);
		  System.out.println(n[4]);
		  System.out.println(x);
		 
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Specific handler "+e.getMessage());
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			System.out.println("Null pointer Exception "+e.getMessage());
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			System.out.println("Specific handler for class not "+e.getMessage());
			e.printStackTrace();
		}
		catch(RuntimeException  e) {
			System.out.println("Runtime Exception  "+e.getMessage());
			e.printStackTrace();
		}
	
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Mandatory lines to be added here");
		}
		  
		  System.out.println("Independent line");
	  }

}


/*

     Problems with syntax will be identified by Compiler itself
     and these problems are called as Errors
     
     Problems- runtime problems
          Logical  - not anticipatable in most cases?
        [  Hardware/network/connectivity/availability based
           Sofware based ]  -anticipate the problem?
          
          Runtime Problems - Exception
         
         [
          Nullpointer
          ArithmeticException
          ArrayIndexOutOfBounds
          .....
         ] -- RuntimeExceptions -------------UnChecked Exceptions
         
         [
           IOException
           SQLException
           ClassNotFoundException
         ]  - Exceptions -- Checked exception
         
         Checked Exceptions - compiler demands it to be handled/compiler identifies it and
                            asks you to handle
                            
         unchecked exception - it is responsibility of programmer to handler compiler
                       wont demand anything
                       
          Object
          Throwable is a subclass for object
          Error and Exception are subclasses of Excecption
          One of the important subclass of Exception is RuntimeException
          All the subclasses of RuntimeException are called as unchecked exceptions
          all the direct descendants of Exception class are called as checked exception
          
          To handle exception java offers five keywords
          
          try
          throw
          throws
          finally
          catch
                       
                       
           exceptions if not handled will lead to abrupt termination of program that is execution
           
           
          
*/