package com.dev.springboot.bootcamp01.springbootmvc.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.validation.annotation.Validated;


import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmployeeDto {
    private Long id;

    @NotNull(message = "Required field in field name")
    private String name;
    private Integer age;
    private LocalDate doj;
    private Boolean isActive;
}
