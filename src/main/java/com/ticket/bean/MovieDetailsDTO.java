/**
 * 
 */
package com.ticket.bean;

/**
 * @author Admin
 *
 */
public class MovieDetailsDTO {
	
	private String movieName;
	private String movieType;
	
	private int[] seatsBooked ;
	/**
	 * 
	 */
	public MovieDetailsDTO() {
	}

	/**
	 * @param movieName
	 * @param movieType
	 */
	public MovieDetailsDTO(String movieName, String movieType) {
		this.movieName = movieName;
		this.movieType = movieType;
	}

	/**
	 * @return the movieName
	 */
	public String getMovieName() {
		return movieName;
	}

	/**
	 * @return the movieType
	 */
	public String getMovieType() {
		return movieType;
	}

	/**
	 * @return the seatsBooked
	 */
	public int[] getSeatsBooked() {
		return seatsBooked;
	}

	/**
	 * @param movieName the movieName to set
	 */
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	/**
	 * @param movieType the movieType to set
	 */
	public void setMovieType(String movieType) {
		this.movieType = movieType;
	}

	/**
	 * @param seatsBooked the seatsBooked to set
	 */
	public void setSeatsBooked(int[] seatsBooked) {
		this.seatsBooked = seatsBooked;
	}

	
	
	
	

}
