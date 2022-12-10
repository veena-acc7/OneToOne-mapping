package com.learning.mapping.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.mapping.Model.Department;
import com.learning.mapping.Model.Student;
import com.learning.mapping.Service.DepartmentService;

@RestController
public class DepartmentController {
	@Autowired
    private DepartmentService departmentService;
	@PostMapping("/department")
    private ResponseEntity<Department> saveDepartment(@RequestBody Department department){
        return ResponseEntity.ok().body(this.departmentService.createDepartment(department));
    }

}
