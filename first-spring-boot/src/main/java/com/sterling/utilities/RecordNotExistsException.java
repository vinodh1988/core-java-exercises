package com.sterling.utilities;

public class RecordNotExistsException extends Exception{
	public RecordNotExistsException() {
		
	}
   
	public String getMessage() {
		return " Record NotExists Exception ";
	}
}

