package com.sterling.interface3;

public class SuperMain {
   public static void main(String[] args) {
	   Common common = new Major();
	   common.fun();
	   common.superfun();
	   common=new Minor();
	   common.fun();
	   common.superfun();
	   common=new Master();
	   common.fun();
	   common.superfun();
	   
	   Common.method();
   }
}
