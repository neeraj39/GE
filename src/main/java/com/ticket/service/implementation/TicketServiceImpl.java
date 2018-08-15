/**
 * 
 */
package com.ticket.service.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ticket.bean.MovieDetailsDTO;
import com.ticket.service.TicketService;

/**
 * @author Admin
 *
 */
@Service
public class TicketServiceImpl implements TicketService {
	
	public static ArrayList<MovieDetailsDTO> listOfMovies = new ArrayList<>();

	/* (non-Javadoc)
	 * @see com.ticket.service.TicketService#addMovie(com.ticket.bean.MovieDetailsDTO)
	 */
	@Override
	public boolean addMovie(MovieDetailsDTO movieDetailsDTO) {
		if(movieDetailsDTO!= null){
			listOfMovies.add(movieDetailsDTO);
		}else{
			return false;
		}
		return true;
		
	}

	/* (non-Javadoc)
	 * @see com.ticket.service.TicketService#getMovies()
	 */
	@Override
	public List<MovieDetailsDTO> getMovies() {
		return listOfMovies;
	}

	/* (non-Javadoc)
	 * @see com.ticket.service.TicketService#bookTicket(com.ticket.bean.MovieDetailsDTO)
	 */
	@Override
	public boolean bookTicket(MovieDetailsDTO movieDetailsDTO) {
		listOfMovies = (ArrayList<MovieDetailsDTO>)listOfMovies.stream().filter(p->p.getMovieName().equalsIgnoreCase(movieDetailsDTO.getMovieName())).map(temp ->{
            MovieDetailsDTO obj = new MovieDetailsDTO();
            obj.setMovieName(temp.getMovieName());
            obj.setMovieType(temp.getMovieType());
            obj.setSeatsBooked(movieDetailsDTO.getSeatsBooked());
            return obj;
        }).collect(Collectors.toList());
		return true;
	}

}
