package com.sync;

public class Factory {
  public static void main(String n[]){
	  CakeFactory c=new CakeFactory();
	  Produce p=new Produce(c);
	  Order o=new Order(c);
	  Dispatch d=new Dispatch(c);
  }
}