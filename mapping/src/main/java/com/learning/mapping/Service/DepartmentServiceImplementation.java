package com.learning.mapping.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.mapping.Model.Department;
import com.learning.mapping.Repository.DepartmentRepository;

@Service
@Transactional

public class DepartmentServiceImplementation implements DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	@Override
	public Department createDepartment(Department department) {
		return this.departmentRepository.save(department);
	}

}
