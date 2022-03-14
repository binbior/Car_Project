package com.example.car_project.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bookingoffice")
public class BookingOffice {
    @Id
    @Column(name = "officeId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int officeId;

    @Column(name = "endContractDeadline")
    private Date endContractDeadline;

    @Column(name = "officeName")
    private String officeName;

    @Column(name = "officePhone")
    private String officePhone;

    @Column(name = "officePlace")
    private String officePlace;

    @Column(name = "officePrice")
    private int officePrice;

    @Column(name = "startContractDeadline")
    private Date startContractDeadline;

    @ManyToOne
    @JoinColumn(name = "tripId")
    private Trip trip;
}
