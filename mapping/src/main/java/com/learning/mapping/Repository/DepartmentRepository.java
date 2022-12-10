package com.learning.mapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.mapping.Model.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
	
}
