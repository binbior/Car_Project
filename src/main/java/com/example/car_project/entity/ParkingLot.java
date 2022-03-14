package com.example.car_project.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "parkinglot")
public class ParkingLot {
    @Id
    @Column(name = "parkId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int parkId;

    @Column(name = "parkArea")
    private int parkArea;

    @Column(name = "parkName")
    private String parkName;

    @Column(name = "parkPlace")
    private String parkPlace;

    @Column(name = "parkPrice")
    private int parkPrice;

    @Column(name = "parkStatus")
    private String parkStatus;
}
