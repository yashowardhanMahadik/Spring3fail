package com.spring3.departmentservicce.repository;

import com.spring3.departmentservicce.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department , Long> {
}
