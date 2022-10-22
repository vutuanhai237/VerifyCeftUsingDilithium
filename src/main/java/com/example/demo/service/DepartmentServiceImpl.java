package com.example.demo.service;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> fetchDepartmentList() {
		return (List<Department>) departmentRepository.findAll();
	}

	@Override
	public Department updateDepartment(Department department, Long departmentId) {
		Department depDB = departmentRepository.findById(departmentId).get();

		if (Objects.nonNull(department.getName()) && !"".equalsIgnoreCase(department.getName())) {
			depDB.setName(department.getName());
		}
		return departmentRepository.save(depDB);
	}

	@Override
	public void deleteDepartmentById(Long departmentId) {
		departmentRepository.deleteById(departmentId);
	}
}