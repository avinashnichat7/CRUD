package com.crud.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {



    @GetMapping(value = "/")
    public String get(){
        return "fsfdf";
    }
}
