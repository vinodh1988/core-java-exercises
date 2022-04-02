package com.sterling.apps.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Emp {
  @Id
	private Integer eno;
  @Column
    private String name;
  @Column	 
    private String city;
  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name="deptno")
   Dept dept;
public Emp() {} 
  
public Emp(Integer eno, String name, String city) {
	super();
	this.eno = eno;
	this.name = name;
	this.city = city;
}
public Integer getEno() {
	return eno;
}
public void setEno(Integer eno) {
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
  
  
}
