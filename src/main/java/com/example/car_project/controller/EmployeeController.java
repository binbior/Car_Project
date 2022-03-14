package com.example.car_project.controller;


import com.example.car_project.DTO.EmployeeDTO;
import com.example.car_project.entity.Employee;
import com.example.car_project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/list-Employee")
    public Page<EmployeeDTO> showAllEmployee(@PathVariable int index, @PathVariable int size){
        return employeeService.showAllEmployee(index, size);
    }

    @GetMapping("/find-employeeById/{id}")
    public EmployeeDTO displayOneEmployee(@PathVariable Integer id){
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/add-employee")
    public EmployeeDTO addEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.addEmployee(employeeDTO);
    }
}
