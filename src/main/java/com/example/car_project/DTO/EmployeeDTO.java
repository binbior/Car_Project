package com.example.car_project.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    private int employeeId;

    private String account;

    private String department;

    private String employeeAddress;

    private Date employeeDob;

    private String employeeEmail;

    private String employeeName;

    private String employeePhone;

    private String password;

    private String sex;

}
