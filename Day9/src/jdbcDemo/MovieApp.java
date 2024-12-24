package jdbcDemo;

import java.sql.SQLException;

public class MovieApp {

    public static void main(String[] args) throws SQLException {
        MovieDAO movieDAO = new MovieDAO();

        // Create a new movie
        Movie newMovie = new Movie();
        newMovie.setTitle("Inception");
        newMovie.setGenre("Science Fiction");
        newMovie.setAvailable(true); // The movie is available for rental
        movieDAO.createMovie(newMovie);

        // Retrieve and print the newly created movie
        Movie retrievedMovie = movieDAO.getMovieById(newMovie.getMovieId());
        if (retrievedMovie != null) {
            System.out.println("Retrieved Movie:");
            System.out.println("Title: " + retrievedMovie.getTitle());
            System.out.println("Genre: " + retrievedMovie.getGenre());
     System.out.println("Availability: " + (retrievedMovie.isAvailable() ? "Available" : "Unavailable"));
            System.out.println("====================================");
        }

        // Update the availability of the movie
        retrievedMovie.setAvailable(false); // Movie is now rented out
        movieDAO.updateMovie(retrievedMovie);

        // Retrieve and print the updated movie
        Movie updatedMovie = movieDAO.getMovieById(retrievedMovie.getMovieId());
        if (updatedMovie != null) {
            System.out.println("Updated Movie:");
            System.out.println("Title: " + updatedMovie.getTitle());
            System.out.println("Genre: " + updatedMovie.getGenre());
            System.out.println("Availability: " +
            (updatedMovie.isAvailable() ? "Available" : "Unavailable"));
            System.out.println("====================================");
        }

        // Delete the movie
        System.out.println("Deleting movie " + updatedMovie.getMovieId());
        movieDAO.deleteMovie(updatedMovie.getMovieId());
        System.out.println("Finished");
    }
}

