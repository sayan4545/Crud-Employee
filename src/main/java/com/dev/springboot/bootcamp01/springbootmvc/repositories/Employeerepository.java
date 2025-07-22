package com.dev.springboot.bootcamp01.springbootmvc.repositories;

import com.dev.springboot.bootcamp01.springbootmvc.dtos.EmployeeDto;
import com.dev.springboot.bootcamp01.springbootmvc.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Employeerepository extends JpaRepository<EmployeeEntity,Long> {
    Optional<EmployeeEntity> findEmployeeByEmail(String email);
}
