package com.example.car_project.controller;


import com.example.car_project.DTO.CarDTO;
import com.example.car_project.DTO.TripDTO;
import com.example.car_project.service.CarService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/car")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping("/listCar")
    public Page<CarDTO> displayAllCar(@PathVariable int size, @PathVariable int index){
        try {
            Page<CarDTO> carDTO = carService.displayAllCar(size, index);
            return carDTO;
        } catch (Exception e){

        }
        return null;
    }

    @PostMapping("/addCar")
    public CarDTO addCar(@RequestBody CarDTO carDTO){
        return carService.addCar(carDTO);
    }

    @GetMapping("/findCarById/{license}")
    public CarDTO getCarByLicensePlate(@PathVariable String license){
        return carService.getCarByLicense(license);
    }


}
