package com.learning.mapping.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.mapping.Model.Student;
import com.learning.mapping.Service.StudentService;

@RestController
public class StudentController {
	 	@Autowired
	    private StudentService studentService;


	    @PostMapping("/student")
	    private ResponseEntity<Student> saveUser(@RequestBody Student student){
	        return ResponseEntity.ok().body(this.studentService.createStudents(student));
	    }
//	    @DeleteMapping("/product/{productId}")
//	    private HttpStatus deleteProduct(@PathVariable long productId){
//	        this.productService.deleteProduct(productId);
//	        return HttpStatus.OK;
//	    }
	    
	    @DeleteMapping("/student/{rollNo}")
	    private HttpStatus deleteProduct(@PathVariable long rollNo) {
	    	this.studentService.deleteProduct(rollNo);
	    	return HttpStatus.OK;
	    }
	
}
