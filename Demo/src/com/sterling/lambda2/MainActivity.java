package com.sterling.lambda2;

public class MainActivity {
    public static void main(String[] args) {
    	//old way
    	Process.doActivity(new Activity() {

			@Override
			public void perform() {
				// TODO Auto-generated method stub
				System.out.println("Key Activity performing...");
			}
    		  
    	});
    	
    	//new way
    	
    	Process.doActivity(()->{
    		System.out.println("Key Acitivity performing..lambda way");
    	});
	}
}
