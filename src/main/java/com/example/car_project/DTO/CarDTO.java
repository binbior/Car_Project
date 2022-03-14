package com.example.car_project.DTO;


import com.example.car_project.entity.ParkingLot;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarDTO {
    private String licensePlate;

    private String carColor;

    private String carType;

    private String company;

    private ParkingLot park;
}
