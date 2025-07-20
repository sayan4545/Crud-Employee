package com.dev.springboot.bootcamp01.springbootmvc.service;

import com.dev.springboot.bootcamp01.springbootmvc.dtos.EmployeeDto;

import java.util.List;
import java.util.Map;

public interface EmployeeService {

    List<EmployeeDto> getAllEmployees();
    EmployeeDto getEmployeeById(Long id);
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
    void deleteEmployeeById(Long id);

    EmployeeDto putEmployee(Long id, EmployeeDto employeeDto);

    EmployeeDto patchEmployee(Long id, Map<String,Object> updates);
}
