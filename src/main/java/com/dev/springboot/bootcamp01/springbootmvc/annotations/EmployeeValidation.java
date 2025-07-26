package com.dev.springboot.bootcamp01.springbootmvc.annotations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class EmployeeValidation implements ConstraintValidator<EmployeeValidator,String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(s==null) return false;
        List<String> userRoles = Arrays.asList("USER","ADMIN");
        return userRoles.contains(s);
    }
}
