package service;

import model.MovieModel;

import java.util.ArrayList;
import java.util.List;

public class MovieService {
    private List<MovieModel> movies;

    public MovieService() {
        this.movies = new ArrayList<>();
    }

    public void addMovie(MovieModel movie) {
        movies.add(movie);
    }

    public void deleteMovie(int id) {
        movies.removeIf(p -> p.getId() == id);
    }

    public List<MovieModel> getAllMovies() {
        return movies;
    }

    public List<MovieModel> getAvailableMovies() {
        List<MovieModel> availableMovies = new ArrayList<>();
        for (MovieModel movie : movies) {
            if (movie.isAvailable()) {
                availableMovies.add(movie);
            }
        }
        return availableMovies;
    }

    public List<MovieModel> getNotAvailableMovies() {
        List<MovieModel> notAvailableMovies = new ArrayList<>();
        for (MovieModel movie : movies) {
            if (!movie.isAvailable()) {
                notAvailableMovies.add(movie);
            }
        }
        return notAvailableMovies;
    }

    public void checkAvailableMovie(int id) {
        for (MovieModel movie : movies) {
            if (movie.getId() == id) {
                movie.setAvailable(true);
                break;
            }
        }
    }
}
