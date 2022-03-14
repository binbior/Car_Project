package com.example.car_project.serviceimpl;

import com.example.car_project.DTO.BookingOfficeDTO;
import com.example.car_project.entity.BookingOffice;
import com.example.car_project.repository.BookingOfficeRepository;
import com.example.car_project.service.BookingOfficeService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookingOfficeServiceImp implements BookingOfficeService {

    private final BookingOfficeRepository bookingOfficeRepository;
    private final ModelMapper modelMapper;

    public BookingOfficeServiceImp(BookingOfficeRepository bookingOfficeRepository, ModelMapper modelMapper) {
        this.bookingOfficeRepository = bookingOfficeRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Page<BookingOfficeDTO> displayAllBookingOffice(int index, int size) {
        Pageable pageable = PageRequest.of(index, size);
        return bookingOfficeRepository.displayAllBooking(pageable);
    }

    @Override
    public BookingOfficeDTO addOffice(BookingOfficeDTO bookingOfficeDTO) {
        BookingOffice bookingOffice = modelMapper.map(bookingOfficeDTO, BookingOffice.class);
        bookingOfficeRepository.save(bookingOffice);
        return bookingOfficeDTO;
    }

    @Override
    public BookingOfficeDTO getOfficeById(int officeId) {
        return bookingOfficeRepository.getBookingOfficeByOfficeId(officeId);
    }
}
