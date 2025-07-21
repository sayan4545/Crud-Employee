package com.dev.springboot.bootcamp01.springbootmvc.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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

    @NotBlank(message = "Required field in field name")
    @Size(min = 1,max = 20,message = "range (1,21)")
    private String name;
    private Integer age;
    private LocalDate doj;
    private Boolean isActive;
}
