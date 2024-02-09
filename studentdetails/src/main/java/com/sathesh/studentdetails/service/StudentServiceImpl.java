package com.sathesh.studentdetails.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.sathesh.studentdetails.entity.Student;
import com.sathesh.studentdetails.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentrepo;

	@Override
	public Student saveStudent(Student newstudent) {
		return studentrepo.save(newstudent);
	}

	@Override
	public List<Student> getallstudents() {
		return studentrepo.findAll();
	}

	@Override
	public void deleteStudent(Long id) {
		studentrepo.deleteById(id);
		
	}

	@Override
	public Optional<Student> updateStudent(Long id) {
		return studentrepo.findById(id);
	}

	@Override
	public Student updatedStudent(Student updatedStudent) {
		
		 Student existingStudent = studentrepo.findById(updatedStudent.getId()).orElse(null);
        if (existingStudent != null) {
            // Update the existing student with the new information
            existingStudent.setName(updatedStudent.getName());
	            existingStudent.setDepartment(updatedStudent.getDepartment());
	            existingStudent.setAge(updatedStudent.getAge());
	            existingStudent.setEmail(updatedStudent.getEmail());
	            existingStudent.setPhoneNumber(updatedStudent.getPhoneNumber());
	            // Save the updated student
	            return studentrepo.save(existingStudent);
	        } else {
	            // Handle if student with given id does not exist
            return null;
        }
	 }
}

		
	 

