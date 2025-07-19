package com.dev.springboot.bootcamp01.springbootmvc.service;

import com.dev.springboot.bootcamp01.springbootmvc.dtos.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    List<EmployeeDto> getAllEmployees();
    EmployeeDto getEmployeeById(Long id);
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
    void deleteEmployeeById(Long id);
}
