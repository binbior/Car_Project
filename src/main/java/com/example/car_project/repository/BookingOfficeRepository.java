package com.example.car_project.repository;

import com.example.car_project.DTO.BookingOfficeDTO;
import com.example.car_project.entity.BookingOffice;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingOfficeRepository extends JpaRepository<BookingOffice, Integer> {

    @Query("SELECT b from BookingOffice b")
    Page<BookingOfficeDTO> displayAllBooking(Pageable pageable);

    BookingOfficeDTO getBookingOfficeByOfficeId(Integer officeId);
}
