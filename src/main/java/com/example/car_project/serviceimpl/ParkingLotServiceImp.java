package com.example.car_project.serviceimpl;

import com.example.car_project.DTO.ParkingLotDTO;
import com.example.car_project.entity.ParkingLot;
import com.example.car_project.repository.ParkingLotRepository;
import com.example.car_project.service.ParkingLotService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ParkingLotServiceImp implements ParkingLotService {
    private final ParkingLotRepository parkingLotRepository;
    private final ModelMapper modelMapper;

    public ParkingLotServiceImp(ParkingLotRepository parkingLotRepository, ModelMapper modelMapper) {
        this.parkingLotRepository = parkingLotRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Page<ParkingLotDTO> displayAllParkingLot(int index, int size) {
        Pageable pageable = PageRequest.of(index, size);
        return parkingLotRepository.displayAllParkingLot(pageable);
    }

    @Override
    public ParkingLotDTO addParkingLot(ParkingLotDTO parkingLotDTO) {
        ParkingLot parkingLot = modelMapper.map(parkingLotDTO, ParkingLot.class);
        parkingLotRepository.save(parkingLot);
        return parkingLotDTO;
    }

    @Override
    public ParkingLotDTO getOfficeById(int parkId) {
        return parkingLotRepository.getParkingLotByParkId(parkId);
    }

    @Override
    public Page<ParkingLotDTO> getParkingLotByPlace(String place, int index, int size) {
        Pageable pageable = PageRequest.of(index, size);

        return parkingLotRepository.getParkingLotByParkPlaceContaining(place, pageable);
    }
}
