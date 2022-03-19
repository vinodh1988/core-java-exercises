package com.collections;

import java.io.Serializable;


//Marker interface -interface without methods
public class Emp implements Serializable,Comparable<Emp>{
	
	
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int eno;
     private String name;
     private String city;
     //private transient String today;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int eno, String name, String city) {
		super();
		this.eno = eno;
		this.name = name;
		this.city = city;
		//this.today = "Saturday";
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Emp [eno=" + eno + ", name=" + name + ", city=" + city +/*"Today "+today+*/ "]";
	}
	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		
		if(eno>o.eno)
			return 1;
	    if(eno<o.eno)
	    	return -1;
	    return 0;
	}
     

     
}
