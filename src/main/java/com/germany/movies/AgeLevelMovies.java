package com.germany.movies;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class AgeLevelMovies. to group the movies in to age catagory
 */
public class AgeLevelMovies {

	/** The age level. */
	private String ageLevel = "";

	/** The list of movies. */
	private List<BriefMovie> listOfMovies = new ArrayList<BriefMovie>();

	/**
	 * Gets the age level.
	 *
	 * @return the age level
	 */
	public String getAgeLevel() {
		return ageLevel;
	}

	/**
	 * Sets the age level.
	 *
	 * @param ageLevel the new age level
	 */
	public void setAgeLevel(String ageLevel) {
		this.ageLevel = ageLevel;
	}

	/**
	 * Gets the list of movies.
	 *
	 * @return the list of movies
	 */
	public List<BriefMovie> getListOfMovies() {
		return listOfMovies;
	}

	/**
	 * Sets the list of movies.
	 *
	 * @param listOfMovies the new list of movies
	 */
	public void setListOfMovies(List<BriefMovie> listOfMovies) {
		this.listOfMovies = listOfMovies;
	}

}
