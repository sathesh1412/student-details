package com.sathesh.studentdetails.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String department;
	private int age;
	private String email; 
	private String phoneNumber;	
	
	public Student() {
		
	}
	
	public Student(String name, String department, int age, String email, String phoneNumber) {
	
		this.name = name;
        this.department = department;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
		
	}
	
	 public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

	    public void setPhoneNumber(String phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }

	  

	    @Override
	    public String toString() {
	        return "StudentDetails{" +
	                "id=" + id +
	                ", name='" + name + '\'' +
	                ", department='" + department + '\'' +
	                ", age=" + age +
	                ", email='" + email + '\'' +
	                ", phoneNumber='" + phoneNumber + '\'' +
	                '}';
	    }
	
}
