package com.dev.springboot.bootcamp01.springbootmvc.repositories;

import com.dev.springboot.bootcamp01.springbootmvc.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employeerepository extends JpaRepository<EmployeeEntity,Long> {
}
