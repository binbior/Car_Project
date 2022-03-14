package com.example.car_project.controller;

import com.example.car_project.DTO.CarDTO;
import com.example.car_project.DTO.EmployeeDTO;
import com.example.car_project.DTO.ParkingLotDTO;
import com.example.car_project.service.ParkingLotService;
import org.hibernate.annotations.Parameter;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parkinglot")
public class ParkingLotController {

    private final ParkingLotService parkingLotService;

    public ParkingLotController(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
    }


    @GetMapping("/list")
    public Page<ParkingLotDTO> displayAllParkingLot(@RequestParam int index, @RequestParam int size){
        try {
            return parkingLotService.displayAllParkingLot(index, size);
        } catch (Exception e){

        }
        return null;
    }

    @GetMapping("/find-park/{id}")
    public ParkingLotDTO displayParkingLotById(@PathVariable Integer parkId){
        return parkingLotService.getOfficeById(parkId);
    }

    @GetMapping("/list-park-by-place")
    public Page<ParkingLotDTO> getParkingLotByPlace(@RequestParam String place, @RequestParam int index, @RequestParam int size){
        return parkingLotService.getParkingLotByPlace(place, index, size);
    }

    @PostMapping("/add-parkinglot")
    public ParkingLotDTO addParkingLot(@RequestBody ParkingLotDTO parkingLotDTO){
        return parkingLotService.addParkingLot(parkingLotDTO);
    }
}
