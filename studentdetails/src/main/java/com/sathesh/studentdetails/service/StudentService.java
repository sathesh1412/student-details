/**
 * 
 */
package com.sathesh.studentdetails.service;

import java.util.List;
import java.util.Optional;

import com.sathesh.studentdetails.entity.Student;

/**
 * 
 */
public interface StudentService {
    
	public Student saveStudent(Student student);
	
	public List<Student> getallstudents();
	
	public void deleteStudent(Long id);
	
	public Optional<Student> updateStudent(Long id);
	 
	public Student updatedStudent(Student updatedStudent);
	
	
}


