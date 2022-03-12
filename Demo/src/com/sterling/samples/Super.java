package com.sterling.samples;

public class Super {
    protected int parent;
    
    public Super() {
    	System.out.println("Super class instance is created ");
    }
    
    public Super(int parent) {
    	this.parent=parent;
    }
    
    public void method1() {
    	System.out.println("Method 1 inside");
    }
    public void show() {
    	System.out.println("Parent data is "+parent);
    }
}
