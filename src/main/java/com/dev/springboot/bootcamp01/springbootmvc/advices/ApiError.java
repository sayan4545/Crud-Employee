package com.dev.springboot.bootcamp01.springbootmvc.advices;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
public class ApiError {
    private String message;
    private HttpStatus status;
}
