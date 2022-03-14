package com.example.car_project.repository;

import com.example.car_project.DTO.CarDTO;
import com.example.car_project.entity.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, String> {
    @Query("SELECT c FROM Car c")
    Page<CarDTO> displayAllCar(Pageable pageable);

    CarDTO getCarByLicensePlateContains(String licensePlate);


}
