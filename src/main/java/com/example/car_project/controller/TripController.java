package com.example.car_project.controller;


import com.example.car_project.DTO.EmployeeDTO;
import com.example.car_project.DTO.TripDTO;
import com.example.car_project.entity.Trip;
import com.example.car_project.service.TripSevice;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trip")
public class TripController {

    private final TripSevice tripSevice;

    public TripController(TripSevice tripSevice) {
        this.tripSevice = tripSevice;
    }


    @GetMapping("/list-trip")
    public Page<TripDTO> displayAllTrip(@PathVariable int size, @PathVariable int index){
        return tripSevice.displayAllTrip(size, index);
    }

    @GetMapping("/find-trip/{id}")
    public TripDTO getTripByTripId(@PathVariable Integer id){
        return tripSevice.getTripByTripId(id);
    }

    @PostMapping("/add-trip")
    public TripDTO addTrip(@RequestBody TripDTO tripDTO){
        return tripSevice.addTrip(tripDTO);
    }

}
