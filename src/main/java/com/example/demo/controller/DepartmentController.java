package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/departments")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}

	@GetMapping("/departments")
	public List<Department> fetchDepartmentList() {
		return departmentService.fetchDepartmentList();
	}

	@PutMapping("/departments/{id}")
	public Department updateDepartment(@RequestBody Department department, @PathVariable("id") Long departmentId) {
		return departmentService.updateDepartment(department, departmentId);
	}

	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
		departmentService.deleteDepartmentById(departmentId);
		return "Deleted Successfully";
	}
}
