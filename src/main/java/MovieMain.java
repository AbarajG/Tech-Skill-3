import model.MovieModel;
import service.MovieService;

import java.util.List;

public class MovieMain {
    public static void main(String[] args) {
        // Crear instancias de películas
        MovieModel movieOne = new MovieModel(1, "Movie 1");
        MovieModel movieTwo = new MovieModel(2, "Movie 2");
        MovieModel movieThree = new MovieModel(3, "Movie 3");

        // Crear el gestor de películas
        MovieService movieService = new MovieService();

        // Agregar películas al gestor
        movieService.addMovie(movieOne);
        movieService.addMovie(movieTwo);
        movieService.addMovie(movieThree);

        // Eliminar una película
        movieService.deleteMovie(2);

        // Marcar una película como disponible
        movieService.checkAvailableMovie(1);

        // Mostrar la lista de películas no disponibles
        System.out.println("Películas no disponibles:");
        for (MovieModel movie : movieService.getNotAvailableMovies()) {
            System.out.println("ID: " + movie.getId() + ", Nombre: " + movie.getName());
        }
    }
}
