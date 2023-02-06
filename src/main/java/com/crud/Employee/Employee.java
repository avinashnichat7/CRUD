package com.crud.Employee;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @NotBlank(message = "name is required")
    private String Name;


    @NotBlank(message = "name is required")
    @JsonFormat(pattern = "dd/mm/yyyy")
    @DateTimeFormat

    private Date date;
    @NotEmpty
    @Size(message = "city is required")
    private String city;
    @NotNull
    private String salary;
    @NotBlank(message = "email is required")
    private String email;
    @NotEmpty(message = "age is required")
    private int age;
}
