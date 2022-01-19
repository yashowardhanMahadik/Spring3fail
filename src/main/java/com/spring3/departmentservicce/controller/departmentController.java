package com.spring3.departmentservicce.controller;

import com.spring3.departmentservicce.entity.Department;
import com.spring3.departmentservicce.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@Slf4j
public class departmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/departments")
    public List<Department> getDepartments(){
        log.info("Inside getDepartments in departmentController");
        return departmentService.getAllDepartments();
    }

    @PostMapping("/department")
    public Department addDepartment(@RequestBody Department department){
        log.info("Inside addDepartments in departmentController");
        return departmentService.addDepartment(department);
    }
}
