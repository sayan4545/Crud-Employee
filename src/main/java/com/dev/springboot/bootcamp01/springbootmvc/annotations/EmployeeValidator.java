package com.dev.springboot.bootcamp01.springbootmvc.annotations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;
import java.util.List;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {EmployeeValidation.class})

public @interface EmployeeValidator {
    String message() default "Role not matched";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
