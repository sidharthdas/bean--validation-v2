package com.validation.validationv2.model;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * @author Sidharth Das
 * created on  07/04/23
 */
@Data
public class Employee {

    @NotNull
    @Size(min = 10)
    private String empName;
    @NotNull
    private String empAddress;
    @NotNull
    private String empPhoneNumber;
}
