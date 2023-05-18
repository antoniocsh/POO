package aula12;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

public class MovieManager {
    static Map<String, List<Movie>> movies;

    public MovieManager() {
        movies = new TreeMap<>();
    }

    public void loadMovies(String filename) throws IOException {
        ArrayList<String> Movies5 = new ArrayList<>();
        Scanner input = new Scanner(new FileReader(filename));
        input.useDelimiter("[\\t\\n]+");
        input.nextLine();
        while (input.hasNext()) {
            String word = input.next().strip();
            Movies5.add(word);

        }
        for (int i = 0; i < Movies5.size(); i += 5) {
            Movie movie = new Movie(Movies5.get(i), Double.parseDouble(Movies5.get(i + 1)), Movies5.get(i + 2),
                    Movies5.get(i + 3), Integer.parseInt(Movies5.get(i + 4)));
            if (movies.containsKey(Movies5.get(i + 3))) {
                movies.get(Movies5.get(i + 3)).add(movie);
            } else {
                List<Movie> moviesList = new ArrayList<>();
                moviesList.add(movie);
                movies.put(Movies5.get(i + 3), moviesList);
            }
        }
        input.close();
    }

    public List<Movie> sortMoviesbyScore() {
        List<Movie> moviesList = new ArrayList<>();
        for (List<Movie> list : movies.values()) {
            moviesList.addAll(list);
        }
        moviesList.sort((m1, m2) -> Double.compare(m2.getScore(), m1.getScore()));
        return moviesList;
    }

    public List<Movie> sortMoviesbyRunningTime() {
        List<Movie> moviesList = new ArrayList<>();
        for (List<Movie> list : movies.values()) {
            moviesList.addAll(list);
        }
        moviesList.sort((m1, m2) -> Integer.compare(m2.getRunningTime(), m1.getRunningTime()));
        return moviesList;
    }

    public List<Movie> sortMoviesbyName() {
        List<Movie> moviesList = new ArrayList<>();
        for (List<Movie> list : movies.values()) {
            moviesList.addAll(list);
        }
        moviesList.sort((m1, m2) -> m1.getName().compareTo(m2.getName()));
        return moviesList;
    }

    public TreeMap<String, Integer> genreNumber() {
        TreeMap<String, Integer> genreNumber = new TreeMap<>();
        for (String genre : movies.keySet()) {
            genreNumber.put(genre, movies.get(genre).size());
        }
        return genreNumber;
    }

    public List<Movie> getMovies60score(String genre) {
        List<Movie> moviesList = new ArrayList<>();
        for (List<Movie> list : movies.values()) {
            moviesList.addAll(list);
        }
        List<Movie> movies60score = new ArrayList<>();
        for (Movie movie : moviesList) {
            if (movie.getScore() >= 60 && movie.getGenre().equals(genre)) {
                movies60score.add(movie);
            }
        }
        return movies60score;
    }

}
