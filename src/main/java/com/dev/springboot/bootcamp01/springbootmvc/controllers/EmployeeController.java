package com.dev.springboot.bootcamp01.springbootmvc.controllers;

import com.dev.springboot.bootcamp01.springbootmvc.dtos.EmployeeDto;
import com.dev.springboot.bootcamp01.springbootmvc.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
public class EmployeeController
{
    private final EmployeeService employeeService;
    @GetMapping("/getAllEmployees")
    public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    @PostMapping("/save")
    public ResponseEntity<EmployeeDto> saveEmployee(@Valid @RequestBody EmployeeDto employeeDto){
        return ResponseEntity.ok(employeeService.saveEmployee(employeeDto));
    }
    @GetMapping("getById/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable Long id){
        //return ResponseEntity.ok(employeeService.getEmployeeById(id));
        if(employeeService.getEmployeeById(id)!=null){
            return new ResponseEntity<>(employeeService.getEmployeeById(id),HttpStatus.FOUND);
        }else{
            throw new NoSuchElementException("No resource found with id ");
        }
    }



    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id){
        employeeService.deleteEmployeeById(id);
    }
    @PutMapping("/put/{id}")
    public ResponseEntity<EmployeeDto> putEmployee(@PathVariable Long id, @RequestBody EmployeeDto employeeDto){
        return ResponseEntity.ok(employeeService.putEmployee(id,employeeDto));
    }

    @PatchMapping("/patch/{id}")
    public ResponseEntity<EmployeeDto> patchEmployee(@PathVariable Long id, Map<String,Object> updates){
        return ResponseEntity.ok(employeeService.patchEmployee(id,updates));
    }
    @GetMapping("/getByEmail")
    public ResponseEntity<EmployeeDto> getByEmail(@RequestParam String email){
        return ResponseEntity.ok(employeeService.findEmployeeByEmail(email));
    }
}
