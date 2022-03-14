package com.example.car_project;

import com.example.car_project.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = EmployeeRepository.class)
public class CarProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarProjectApplication.class, args);
    }

}
