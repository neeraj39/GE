/**
 * 
 */
package com.ticket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.bean.MovieDetailsDTO;
import com.ticket.service.TicketService;

/**
 * Controller method
 *
 */
@RestController
public class TicketController {
	
	@Autowired
	TicketService ticketService;
	
	@RequestMapping(method=RequestMethod.POST,value="/addmovie")
	public boolean addMovie(@RequestBody MovieDetailsDTO movieDetailsDTO){
		return ticketService.addMovie(movieDetailsDTO);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/listmovies")
	public List<MovieDetailsDTO> listMovies(){
		return ticketService.getMovies();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/bookticket")
	public boolean bookTicket(@RequestBody MovieDetailsDTO movieDetailsDTO){
		return ticketService.bookTicket(movieDetailsDTO);
	}

}
