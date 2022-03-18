package com.general;

public class Mutable {
    private int a;
    
    Mutable(int a){
       this.a =a;	
    }
    public void change(int a) {
    	this.a =a;
    }    
    public void show() {
    	System.out.println(a+" is the value");
    }
}
