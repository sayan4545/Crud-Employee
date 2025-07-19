package com.dev.springboot.bootcamp01.springbootmvc.dtos;

import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmployeeDto {
    private Long id;
    private String name;
    private Integer age;
    private LocalDate doj;
    private Boolean isActive;
}
