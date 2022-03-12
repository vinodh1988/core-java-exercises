/*

   In java  along with syntax rules, Conventions plays a very crucial role
   
   Java Class naming rules
   
     not syntax rule but convention
	            - start class name with uppercase
				- if a class name has multiple words use camel case avoid underscore
				   ex:  First_name [not good], FirstName [good]
	 sytax rule-
	 
	           no special characters except underscore
			   cannot start with number
			   no spaces allowed
			   numbers can be used but not as first character
			   
	Method and variable naming conventions
	
	             same rules as that of the class only
				 difference is start with lowercase
				 
	In java, there are three kinds of variables
	
	     1. Instance variables
		      
			  Variables which are created for every instance
			  usually instances of classes will hold the instance variables
			  instances will be in heap memory
			  
		 2. Class Variables
		      
			  Variables which are common for all instances
			  class variables are declared with static keyword
			  
			  since static members are common they can be referrered instance scope -non static scope
			  but in static context only static members can accessed
			  
		 3. Local Variables
		       Variables which are created within a method
			   variables which are method parameters
			   scope is only within the method
			   

*/
class Test{
     public static void main(String n[]){
		 System.out.println("First Java program");
		 m1();
	 }
	 //this is an instance method
	 public void m1(){
		 System.out.println("This is method1");
	 }
    
	 public int add(int a, int b){
		 return a+b;
	 }
}

class Test2{


}