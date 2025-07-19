package com.dev.springboot.bootcamp01.springbootmvc.service;

import com.dev.springboot.bootcamp01.springbootmvc.entities.EmployeeEntity;
import com.dev.springboot.bootcamp01.springbootmvc.repositories.Employeerepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


import com.dev.springboot.bootcamp01.springbootmvc.dtos.EmployeeDto;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{
    private final Employeerepository employeerepository;
    private final ModelMapper modelMapper;
    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<EmployeeEntity> listOfEmployees = employeerepository.findAll();
        return listOfEmployees.stream()
                .map(employee->modelMapper.map(listOfEmployees,EmployeeDto.class)).toList();
    }

    @Override
    public EmployeeDto getEmployeeById(Long id) {
        Optional<EmployeeEntity> employeeEntity = employeerepository.findById(id);
        if(employeeEntity!=null){
            EmployeeDto employeeDto = modelMapper.map(employeeEntity,EmployeeDto.class);
            return employeeDto;
        }
        return null;
    }

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        EmployeeEntity employeeEntity = modelMapper.map(employeeDto,EmployeeEntity.class);
        return modelMapper.map(employeerepository.save(employeeEntity),EmployeeDto.class);
    }

    @Override
    public void deleteEmployeeById(Long id) {
        Optional<EmployeeEntity> empl = employeerepository.findById(id);
        if(empl!=null){
            employeerepository.deleteById(id);
        }
    }
}
