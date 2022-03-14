package com.example.car_project.service;

import com.example.car_project.DTO.TripDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TripSevice {
    TripDTO addTrip(TripDTO tripDTO);

    Page<TripDTO> displayAllTrip(int size, int index);

    TripDTO getTripByTripId(Integer tripId);
}
