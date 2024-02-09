package com.sathesh.studentdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sathesh.studentdetails.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

}
