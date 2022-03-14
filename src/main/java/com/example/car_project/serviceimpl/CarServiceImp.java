package com.example.car_project.serviceimpl;

import com.example.car_project.DTO.CarDTO;
import com.example.car_project.entity.Car;
import com.example.car_project.repository.CarRepository;
import com.example.car_project.service.CarService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImp implements CarService {

    private final CarRepository carRepository;
    private final ModelMapper modelMapper;

    public CarServiceImp(CarRepository carRepository, ModelMapper modelMapper) {
        this.carRepository = carRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public CarDTO addCar(CarDTO carDTO) {
        Car car = modelMapper.map(carDTO, Car.class);
        carRepository.save(car);
        return carDTO;
    }

    @Override
    public Page<CarDTO> displayAllCar(int size, int index) {
        Pageable pageable = PageRequest.of(index, size);
        return carRepository.displayAllCar(pageable);
    }

    @Override
    public CarDTO getCarByLicense(String licensePlate) {
        return carRepository.getCarByLicensePlateContains(licensePlate);
    }
}
