package com.learning.mapping.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "department")
public class Department {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  long deptId;

	   @Column(name = "deptName")
	     String deptName;
		 @OneToOne(mappedBy = "department",cascade = CascadeType.ALL)
		 private Student student;
		public Student getStudent() {
			return student;
		}

		public void setStudent(Student student) {
			this.student = student;
		}
		 
		public long getDeptId() {
			return deptId;
		}

		public void setDeptId(long deptId) {
			this.deptId = deptId;
		}

		public String getDeptName() {
			return deptName;
		}

		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}
		 
		
		
		
		//@JsonBackReference
		//onetomany mapping
//		 public List<Student> getStudent() {
//			return student;
//		}
//
//		public void setStudent(List<Student> student) {
//			this.student = student;
//		}



	




}
