/*
   java has 8 primitive datatypes
   
      int(32) , short(16), byte (8) ,long (64)
	  float(32), double(64)
	  character(16)
	  boolean(1)
*/
class Person{
   private int sno;
   private String name;
   private static int population;
    public Person(){
		 population++;
	}
	//non static
  public Person(int sno,String name){
     this.sno=sno; //current instance is this
	 this.name=name;
	 population++;
   }
   //non static
   public void display(){
     System.out.println(sno+"  "+name);
   }
   
   public static void showPopulation(){
	   System.out.println("Population:"+population);
   }
}

class Main{
	public static void main(String n[]){
		Person obj=new Person();
		obj.display();
		
		Person obj1=new Person(1,"Raj");
		obj1.display();
		
		Person obj2=obj1;
		
		obj.showPopulation();
		Person.showPopulation();
		
	}
}