package com.example.car_project.service;

import com.example.car_project.DTO.TicketDTO;
import com.example.car_project.entity.Ticket;
import org.springframework.data.domain.Page;

public interface TicketService {

    Page<TicketDTO> displayAllTicket(int size, int index);

    TicketDTO addTicket(TicketDTO ticketDTO);

    TicketDTO getTicketByTicketId(Integer ticketId);

    void deleteTicketById(TicketDTO ticketDTO);
}
