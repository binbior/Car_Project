package com.example.car_project.repository;

import com.example.car_project.DTO.EmployeeDTO;
import com.example.car_project.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    @Query("SELECT e from Employee e")
    Page<EmployeeDTO> showAllEmployee(Pageable pageable);

    EmployeeDTO getEmployeeByEmployeeId(Integer id);

    List<Employee> getEmployeeByEmployeeName(String name);
}
