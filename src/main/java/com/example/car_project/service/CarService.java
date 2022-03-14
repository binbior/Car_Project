package com.example.car_project.service;

import com.example.car_project.DTO.CarDTO;
import org.springframework.data.domain.Page;


public interface CarService {

    CarDTO addCar(CarDTO carDTO);

    Page<CarDTO> displayAllCar(int size, int index);

    CarDTO getCarByLicense(String licensePlate);

}
