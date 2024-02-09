package com.sathesh.studentdetails.controller;

import java.util.List;
//import java.util.Optional;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sathesh.studentdetails.entity.Student;
import com.sathesh.studentdetails.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	

	
	@GetMapping("/addStudent")
	public String addStudent() {
		return "addStudent";
	}
	
	
	@PostMapping("/savedStudents")
	public String savedStudents(Student student) {
	   studentservice.saveStudent(student);
	   return "redirect:/getAllStudents";
		
	}
	
	
	 @GetMapping("/getAllStudents") 
     public String getAllStudents(Model model) {
	    List<Student> student = studentservice.getallstudents();
	    model.addAttribute("Allstudents", student); 
	    return "Allstudents";
	 }
	 
	
	//another method--using  ModelAndView class
	/*
	 * @GetMapping("/getAllStudents") public ModelAndView getAllStudent() {
	 * List<Student> student = studentservice.getallstudents(); return new
	 * ModelAndView ("Allstudents","Allstudents",student);
	 * 
	 * }
	 */
	
	@GetMapping("/deleteStudent/{id}")
	public String deletestudent(@PathVariable Long id) {
	    studentservice.deleteStudent(id);
	    return "redirect:/getAllStudents";
	}
	
	@GetMapping("/updateStudent/{id}")
	public String showUpdateForm(@PathVariable Long id, Model model) {
	    // Fetch the student details from the database based on the ID
	    Optional<Student> optionalStudent = studentservice.updateStudent(id);
	    
	    // Check if the student exists
	    if (optionalStudent.isPresent()) {
	        Student student = optionalStudent.get();
	        
	        // Add the student object to the model attribute
	        model.addAttribute("student", student);
	        
	        // Return the name of the update form JSP file
	        return "updateStudentForm";
	    } else {
	        // If the student is not found, handle the error or redirect to another page
	        return "errorPage";
	    }
	}
	
	@PostMapping("/updatedStudent/{id}")
	public String updateStudent( Student student, @PathVariable Long id) {
	    // Set the ID of the student from the path variable
	    student.setId(id);
	    
	    // Call the service method to update the student
	    studentservice.updatedStudent(student);
	    
	    // Redirect to the URL to display all students
	    return "redirect:/getAllStudents";
	}
	
}
