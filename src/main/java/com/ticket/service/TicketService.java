/**
 * 
 */
package com.ticket.service;

import java.util.List;

import com.ticket.bean.MovieDetailsDTO;

/**
 * @author Admin
 *
 */
public interface TicketService {
	
	public boolean addMovie(MovieDetailsDTO movieDetailsDTO);
	public List<MovieDetailsDTO> getMovies();
	public boolean bookTicket(MovieDetailsDTO movieDetailsDTO);

}
