package com.example.car_project.service;

import com.example.car_project.DTO.BookingOfficeDTO;
import org.springframework.data.domain.Page;

public interface BookingOfficeService {

    Page<BookingOfficeDTO> displayAllBookingOffice(int index, int size);

    BookingOfficeDTO addOffice(BookingOfficeDTO bookingOfficeDTO);

    BookingOfficeDTO getOfficeById(int officeId);
}
