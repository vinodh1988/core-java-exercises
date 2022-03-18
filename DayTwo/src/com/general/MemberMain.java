package com.general;

public class MemberMain {
    public static void main(String n[]) {
    	//case 1
    /*	Member.callMe();
    	Member.callMe();
    	Member.callMe();*/
    	//case 2
    	/*new Member();
    	new Member();
    	new Member();*/
    	
    	//case 3
    	try {
			Class.forName("com.general.Member");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//this methods will load class into memory
    }
}
