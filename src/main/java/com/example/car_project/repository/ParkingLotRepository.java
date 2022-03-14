package com.example.car_project.repository;

import com.example.car_project.DTO.ParkingLotDTO;
import com.example.car_project.entity.ParkingLot;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ParkingLotRepository extends JpaRepository<ParkingLot, Integer> {

    @Query("SELECT p FROM ParkingLot p")
    Page<ParkingLotDTO> displayAllParkingLot(Pageable pageable);

    ParkingLotDTO getParkingLotByParkId(Integer parkId);

    Page<ParkingLotDTO> getParkingLotByParkPlaceContaining(String place, Pageable pageable);
}
