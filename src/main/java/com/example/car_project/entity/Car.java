package com.example.car_project.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "car")
public class Car {
    @Id
    @Column(name = "licensePlate")
    private String licensePlate;

    @Column(name = "carColor")
    private String carColor;

    @Column(name = "carType")
    private String carType;

    @Column(name = "company")
    private String company;

    @ManyToOne
    @JoinColumn(name = "parkId")
    private ParkingLot park;

}
