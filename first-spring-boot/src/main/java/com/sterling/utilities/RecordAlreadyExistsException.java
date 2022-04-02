package com.sterling.utilities;

public class RecordAlreadyExistsException extends Exception {
	
	public RecordAlreadyExistsException() {
		
	}
   
	public String getMessage() {
		return " Record Already Exists Exception ";
	}
}
