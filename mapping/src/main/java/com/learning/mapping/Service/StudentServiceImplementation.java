package com.learning.mapping.Service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.learning.mapping.Exception.StudentException;
import com.learning.mapping.Model.Department;
import com.learning.mapping.Model.Student;
import com.learning.mapping.Repository.DepartmentRepository;
import com.learning.mapping.Repository.StudentRepository;

@Service
@Transactional

public class StudentServiceImplementation implements StudentService {
	 	@Autowired
	    private StudentRepository studentRepository;
	 	@Autowired
	 	private DepartmentRepository departmentRepository;

 	   @Override
	    public Student createStudents(Student student){
	    	//Department department=student.getDepartment();
	    	//student.setDepartment(department);
	    	//departmentRepository.save(department);
	    	
	        return this.studentRepository.save(student);
	    }
// 	  @Override
// 		public void deleteProduct(long product_id) {
// 			Optional<product> prodObj=this.productRepo.findById((long) product_id);
// 			if(prodObj.isPresent()) {
// 				this.productRepo.deleteById(product_id);
// 			}
// 			else {
// 				throw new ProductException("didnt find id");
// 			}
// 		}
 	   @Override
 	   public void deleteProduct(long rollNo) {
 		   Optional<Student> studObj=this.studentRepository.findById(rollNo);
 		   if (studObj.isPresent()) {
 			   this.studentRepository.deleteById(rollNo);
 		   }
 		   else {
 			   throw new StudentException("didnt find id");
 		   }
 	   }
}
