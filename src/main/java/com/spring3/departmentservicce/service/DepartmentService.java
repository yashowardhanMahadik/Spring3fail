package com.spring3.departmentservicce.service;

import com.spring3.departmentservicce.entity.Department;
import com.spring3.departmentservicce.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    // This should be interface
    // DepartmentServiceImpl should be there separately
    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }
}
