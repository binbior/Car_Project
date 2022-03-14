package com.example.car_project.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ParkingLotDTO {
    private int parkId;

    private int parkArea;

    private String parkName;

    private String parkPlace;

    private int parkPrice;

    private String parkStatus;
}
