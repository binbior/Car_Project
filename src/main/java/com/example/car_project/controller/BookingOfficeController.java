package com.example.car_project.controller;


import com.example.car_project.DTO.BookingOfficeDTO;
import com.example.car_project.DTO.CarDTO;
import com.example.car_project.service.BookingOfficeService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/office")
public class BookingOfficeController {

    private final BookingOfficeService bookingOfficeService;

    public BookingOfficeController(BookingOfficeService bookingOfficeService) {
        this.bookingOfficeService = bookingOfficeService;
    }


    @GetMapping("/list-office")
    public Page<BookingOfficeDTO> displayAllOffice(@PathVariable int index, @PathVariable int size){
        try {
            Page<BookingOfficeDTO> bookingOfficeDTO = bookingOfficeService.displayAllBookingOffice(index, size);
            return bookingOfficeDTO;
        } catch (Exception e){

        }
        return null;
    }

    @PostMapping("/add-office")
    public BookingOfficeDTO addOffice(@RequestBody BookingOfficeDTO bookingOfficeDTO){
        return bookingOfficeService.addOffice(bookingOfficeDTO);
    }

    @GetMapping("/find-office/{officeId}")
    public BookingOfficeDTO getOfficeById(@PathVariable Integer officeId){
        return bookingOfficeService.getOfficeById(officeId);
    }
}
