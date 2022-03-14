package com.example.car_project.repository;

import com.example.car_project.DTO.TripDTO;
import com.example.car_project.entity.Trip;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TripRepository extends JpaRepository<Trip, Integer> {
    @Query("SELECT t from Trip t")
    Page<TripDTO> displayAllList(Pageable pageable);

    TripDTO getTripByTripId(Integer tripId);

}
