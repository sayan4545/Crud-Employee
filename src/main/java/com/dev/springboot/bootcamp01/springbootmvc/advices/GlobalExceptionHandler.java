package com.dev.springboot.bootcamp01.springbootmvc.advices;

import com.dev.springboot.bootcamp01.springbootmvc.exceptions.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiError> handleNoSuchElementException(ResourceNotFoundException e){
        ApiError error = ApiError.builder()
                .message(e.getMessage())
                .status(HttpStatus.NOT_FOUND)
                .build();
        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    }
}
