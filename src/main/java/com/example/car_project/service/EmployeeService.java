package com.example.car_project.service;

import com.example.car_project.DTO.EmployeeDTO;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {

    EmployeeDTO addEmployee(EmployeeDTO employeeDTO);

    Page<EmployeeDTO> showAllEmployee(int index, int size);

    EmployeeDTO getEmployeeById(Integer id);

}
