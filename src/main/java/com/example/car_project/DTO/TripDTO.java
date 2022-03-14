package com.example.car_project.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TripDTO {
    private int tripId;

    private int bookedTicketNumber;

    private String carType;

    private Time departureTime;

    private String destination;

    private String driver;

    private int maxTicketNumber;
}
