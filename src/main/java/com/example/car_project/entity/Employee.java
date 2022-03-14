package com.example.car_project.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "employee")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @Column(name = "employeeId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeId;

    @Column(name = "account")
    private String account;

    @Column(name = "department")
    private String department;

    @Column(name = "employeeAddress")
    private String employeeAddress;

    @Column(name = "employeeBirthday")
    private Date employeeDob;

    @Column(name = "employeeEmail")
    private String employeeEmail;

    @Column(name = "employeeName")
    private String employeeName;

    @Column(name = "employeePhone")
    private String employeePhone;

    @Column(name = "password")
    private String password;

    @Column(name = "sex")
    private String sex;
}
