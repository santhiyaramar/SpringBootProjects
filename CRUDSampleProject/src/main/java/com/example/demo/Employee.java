package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Employee {
	private String name;
	@Id
	private int empId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String toString()
	  {
	    return this.name + " -> " +this.empId;
	  }
}
