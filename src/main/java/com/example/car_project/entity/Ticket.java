package com.example.car_project.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ticket")
public class Ticket {
    @Id
    @Column(name = "ticketId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ticketId;

    @Column(name = "bookingTime")
    private Time bookingTime;

    @Column(name = "customerName")
    private String customerName;

    @ManyToOne
    @JoinColumn(name = "licensePlate")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "tripId")
    private Trip trip;
}
