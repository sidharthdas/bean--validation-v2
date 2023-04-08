package com.validation.validationv2.controller;

import com.validation.validationv2.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.*;
import java.util.Set;


/**
 * @author Sidharth Das
 * created on  08/04/23
 */
@RestController
public class EmployeeController {

    @Autowired
    Validator validator;

    @PostMapping("/employee")
    public String testEmployee( @RequestBody Employee employee){
        Set<ConstraintViolation<Employee>> set = validator.validate(employee);
        return employee.toString();
    }

    @PostMapping("/employee-v2")
    public String testEmployeeV2(@Valid @RequestBody Employee employee){
        Set<ConstraintViolation<Employee>> set = validator.validate(employee);
        return employee.toString();
    }
}
