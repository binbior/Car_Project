package com.example.car_project.service;

import com.example.car_project.DTO.ParkingLotDTO;
import org.springframework.data.domain.Page;

public interface ParkingLotService {

    Page<ParkingLotDTO> displayAllParkingLot(int index, int size);

    ParkingLotDTO addParkingLot(ParkingLotDTO parkingLotDTO);

    ParkingLotDTO getOfficeById(int parkId);

    Page<ParkingLotDTO> getParkingLotByPlace(String place, int index, int size);
}
