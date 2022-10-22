package com.example.demo.service;
import java.util.List;
import com.example.demo.model.Department;

public interface DepartmentService {
	Department saveDepartment(Department department);
	List<Department> fetchDepartmentList();
	Department updateDepartment(Department department, Long departmentId);
	void deleteDepartmentById(Long departmentId);
}