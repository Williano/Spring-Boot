package com.williano.Springboottutorial.service;

import com.williano.Springboottutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> getAllDepartments();

    public Department getDepartment(Long departmentId);

    public void deleteDepartment(Long departmentId);
}
