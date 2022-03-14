package com.example.car_project.serviceimpl;

import com.example.car_project.DTO.EmployeeDTO;
import com.example.car_project.entity.Employee;
import com.example.car_project.repository.EmployeeRepository;
import com.example.car_project.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    public EmployeeServiceImp(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public EmployeeDTO addEmployee(EmployeeDTO employeeDTO) {
        Employee employee = modelMapper.map(employeeDTO, Employee.class);
        employeeRepository.save(employee);
        return employeeDTO;
    }

    @Override
    public Page<EmployeeDTO> showAllEmployee(int index, int size) {
        Pageable pageable = PageRequest.of(index, size);
        return employeeRepository.showAllEmployee(pageable);
    }


    @Override
    public EmployeeDTO getEmployeeById(Integer id) {
        return employeeRepository.getEmployeeByEmployeeId(id);
    }



}
