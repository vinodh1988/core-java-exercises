package com.collections;

public class Generic<T> {
  // private Integer data;
 //private Object data;
	private T data;
public Generic(T data) {
	super();
	this.data = data;
}

public void setData(T data) {
	this.data=data;
}

public Object getData() {
	return data;
}
public void display() {
	System.out.println("Data "+this.data);
}
   
   
}
