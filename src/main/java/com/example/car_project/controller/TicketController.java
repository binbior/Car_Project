package com.example.car_project.controller;

import com.example.car_project.DTO.TicketDTO;
import com.example.car_project.entity.Ticket;
import com.example.car_project.service.TicketService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }


    @GetMapping("/list-ticket")
    public Page<TicketDTO> displayAllTicket(@PathVariable int index, @PathVariable int size){
        try {
            Page<TicketDTO> TicketDTO = ticketService.displayAllTicket(index, size);
            return TicketDTO;
        } catch (Exception e){

        }
        return null;
    }

    @PostMapping("/add-ticket")
    public TicketDTO addTicket(@RequestBody TicketDTO ticketDTO){
        return ticketService.addTicket(ticketDTO);
    }

    @GetMapping("/find-ticket/{id}")
    public TicketDTO getTicketByTicketId(@PathVariable Integer ticketId){
        return ticketService.getTicketByTicketId(ticketId);
    }

    @DeleteMapping("/delete-ticket")
    public void deleteTicketByTicketId(@RequestBody TicketDTO ticketDTO){
        ticketService.deleteTicketById(ticketDTO);
    }
}
