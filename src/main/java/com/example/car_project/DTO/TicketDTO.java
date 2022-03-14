package com.example.car_project.DTO;


import com.example.car_project.entity.Car;
import com.example.car_project.entity.Trip;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TicketDTO {
    private int ticketId;

    private Time bookingTime;

    private String customerName;

    private Car car;

    private Trip trip;
}
