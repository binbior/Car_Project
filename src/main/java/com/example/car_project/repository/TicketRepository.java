package com.example.car_project.repository;

import com.example.car_project.DTO.TicketDTO;
import com.example.car_project.entity.Ticket;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {

    @Query("SELECT t FROM Ticket t")
    Page<TicketDTO> displayAllTicket(Pageable pageable);

    TicketDTO getTicketByTicketId(Integer ticketId);

}
