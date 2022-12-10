package com.learning.mapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.mapping.Model.Student;
//import com.learning.mapping.Model.student;


@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{
}
 
