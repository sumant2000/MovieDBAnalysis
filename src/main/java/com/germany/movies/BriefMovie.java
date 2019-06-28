package com.germany.movies;

/**
 * The Class BriefMovie. because requirement is to just display ID, Title,
 * production year
 */
public class BriefMovie {

	/** The id. */
	String id;

	/** The title. */
	String title;

	/** The year. */
	String year;

	/**
	 * Instantiates a new brief movie.
	 *
	 * @param assetId the asset id
	 * @param title2 the title 2
	 * @param productionYear the production year
	 */
	public BriefMovie(String assetId, String title2, String productionYear) {
		id = assetId;
		title = title2;
		year = productionYear;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title.
	 *
	 * @param title the new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the year.
	 *
	 * @return the year
	 */
	public String getYear() {
		return year;
	}

	/**
	 * Sets the year.
	 *
	 * @param year the new year
	 */
	public void setYear(String year) {
		this.year = year;
	}

}
