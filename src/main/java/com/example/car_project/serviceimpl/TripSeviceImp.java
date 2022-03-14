package com.example.car_project.serviceimpl;

import com.example.car_project.DTO.TripDTO;
import com.example.car_project.entity.Trip;
import com.example.car_project.repository.TripRepository;
import com.example.car_project.service.TripSevice;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TripSeviceImp implements TripSevice {
    private final TripRepository tripRepository;
    private final ModelMapper modelMapper;

    public TripSeviceImp(TripRepository tripRepository, ModelMapper modelMapper) {
        this.tripRepository = tripRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public TripDTO addTrip(TripDTO tripDTO) {
        Trip trip = modelMapper.map(tripDTO, Trip.class);
        tripRepository.save(trip);
        return tripDTO;
    }

    @Override
    public Page<TripDTO> displayAllTrip(int size, int index) {
        Pageable pageable = PageRequest.of(index, size);
        return tripRepository.displayAllList(pageable);
    }

    @Override
    public TripDTO getTripByTripId(Integer tripId) {
        return tripRepository.getTripByTripId(tripId);
    }
}
