package com.germany.movies;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

/**
 * Main application class. has main method, this is to be executed.
 */
public class MovieCatagorizationApp
{

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main( String[] args )
	{
		MovieCatagorizationApp objMovieCatagorizationApp = new MovieCatagorizationApp();

		// Read the json file using readStream method and store in movie list.
		ArrayList<Movie> moviesList = objMovieCatagorizationApp.readStream();

		// To find out how many age levels exists.
		Map<List<String>, List<Movie>> movieByAgeLevel = moviesList.stream()
				.collect(Collectors.groupingBy(Movie::getFskLevelListFacet));

		// As age levels are multiple for particular movie, need to find out actual age
		// levels. following code shows, age levels are 11
		List<String> ageList = new ArrayList<String>();
		movieByAgeLevel.forEach((k, v) -> {
			k.stream().forEach(a -> {
				if (!ageList.contains(a)) {
					ageList.add(a);
				}
			});
		});

		// As the requirement is to show age wise movies, 11 collections needed
		AgeLevelMovies[] listOfAgeLevelMovies = new AgeLevelMovies[11];

		// Quickly initializing the array to avoid nullpointer
		for (int i = 0; i < 11; i++) {
			listOfAgeLevelMovies[i] = new AgeLevelMovies();
		}
		// setting the age level
		listOfAgeLevelMovies[0].setAgeLevel("FSF12");
		listOfAgeLevelMovies[1].setAgeLevel("FSK12");
		listOfAgeLevelMovies[2].setAgeLevel("FSK16");
		listOfAgeLevelMovies[3].setAgeLevel("FSKfrei");
		listOfAgeLevelMovies[4].setAgeLevel("FSK6");
		listOfAgeLevelMovies[5].setAgeLevel("FSF6");
		listOfAgeLevelMovies[6].setAgeLevel("FSK18");
		listOfAgeLevelMovies[7].setAgeLevel("Infoprogramm");
		listOfAgeLevelMovies[8].setAgeLevel("FSF0");
		listOfAgeLevelMovies[9].setAgeLevel("FSF16");
		listOfAgeLevelMovies[10].setAgeLevel("FSF18");

		// populate each age level collection by list of movies by iterating through
		// 1000 movie list once.
		for (int i = 0; i < moviesList.size(); i++) {
			Movie testMovie = moviesList.get(i);
			for (int j = 0; j < testMovie.getFskLevelListFacet().size(); j++) {
				BriefMovie briefMovie = new BriefMovie(testMovie.getAssetId(), testMovie.getTitle(),
						testMovie.getProductionYear());
				switch (testMovie.getFskLevelListFacet().get(j)) {

				case "FSF12":
					listOfAgeLevelMovies[0].getListOfMovies().add(briefMovie);
				case "FSK12":
					listOfAgeLevelMovies[1].getListOfMovies().add(briefMovie);
				case "FSK16":
					listOfAgeLevelMovies[2].getListOfMovies().add(briefMovie);
				case "FSKfrei":
					listOfAgeLevelMovies[3].getListOfMovies().add(briefMovie);
				case "FSK6":
					listOfAgeLevelMovies[4].getListOfMovies().add(briefMovie);
				case "FSF6":
					listOfAgeLevelMovies[5].getListOfMovies().add(briefMovie);
				case "FSK18":
					listOfAgeLevelMovies[6].getListOfMovies().add(briefMovie);
				case "Infoprogramm":
					listOfAgeLevelMovies[7].getListOfMovies().add(briefMovie);
				case "FSF0":
					listOfAgeLevelMovies[8].getListOfMovies().add(briefMovie);
				case "FSF16":
					listOfAgeLevelMovies[9].getListOfMovies().add(briefMovie);
				case "FSF18":
					listOfAgeLevelMovies[10].getListOfMovies().add(briefMovie);
				}
			}

		}

		// converting array to list to iterate easily using stream of java 8
		List<AgeLevelMovies> al = Arrays.asList(listOfAgeLevelMovies);

		// to convert the collected list in to json object
		Map<String, List<AgeLevelMovies>> collect = al.stream()
				.collect((Collectors.groupingBy(AgeLevelMovies::getAgeLevel)));
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonStr = gson.toJson(collect);
		try {
			FileWriter fileWriter = new FileWriter(
					new File(System.getProperty("user.dir") + "/src/main/resources/legalRequirement.json"));
			fileWriter.write(jsonStr);
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}





	/**
	 * Read stream.
	 *
	 * @return
	 */
	public ArrayList<Movie> readStream() {
		ArrayList<Movie> moviesList = new ArrayList<Movie>();
		JsonReader reader = null;
		try {

			reader = new JsonReader(new InputStreamReader(
					new FileInputStream(new File(System.getProperty("user.dir") + "/src/main/resources/assets.json")),
					StandardCharsets.UTF_8));
			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			// Read file in stream mode
			reader.beginArray();
			while (reader.hasNext()) {
				// Read data into object model
				Movie movie = gson.fromJson(reader, Movie.class);
				if (movie.getAssetId() != null) {

					moviesList.add(movie);
				}
			}
			reader.close();
		} catch (UnsupportedEncodingException ex) {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			ex.printStackTrace();
		} catch (IOException ex) {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			ex.printStackTrace();
		}
		return moviesList;
	}

}
