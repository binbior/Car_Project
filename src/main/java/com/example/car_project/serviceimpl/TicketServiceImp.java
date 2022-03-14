package com.example.car_project.serviceimpl;

import com.example.car_project.DTO.TicketDTO;
import com.example.car_project.entity.Ticket;
import com.example.car_project.repository.TicketRepository;
import com.example.car_project.service.TicketService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImp implements TicketService {

    private final TicketRepository ticketRepository;
    private final ModelMapper modelMapper;

    public TicketServiceImp(TicketRepository ticketRepository, ModelMapper modelMapper) {
        this.ticketRepository = ticketRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Page<TicketDTO> displayAllTicket(int size, int index) {
        Pageable pageable = PageRequest.of(index, size);
        return ticketRepository.displayAllTicket(pageable);
    }

    @Override
    public TicketDTO addTicket(TicketDTO ticketDTO) {
        Ticket ticket = modelMapper.map(ticketDTO, Ticket.class);
        ticketRepository.save(ticket);
        return ticketDTO;
    }

    @Override
    public TicketDTO getTicketByTicketId(Integer ticketId) {
        return ticketRepository.getTicketByTicketId(ticketId);
    }

    @Override
    public void deleteTicketById(TicketDTO ticketDTO) {
        Ticket ticket = modelMapper.map(ticketDTO, Ticket.class);
        ticketRepository.delete(ticket);
    }
}
