package jdbcDemo;

import java.sql.*;

public class MovieDAO {
    private Connection connection;

    // Constructor to establish the database connection
    public MovieDAO() {
        try {
            connection = DatabaseConnection.getConnection(); // Assume DatabaseConnection is properly defined elsewhere
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Create a new movie record
    public void createMovie(Movie movie) throws SQLException {
        String sql = "INSERT INTO movie (title, genre, is_available) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, movie.getTitle());
            statement.setString(2, movie.getGenre());
            statement.setBoolean(3, movie.isAvailable());
            statement.executeUpdate();

            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                movie.setMovieId(generatedKeys.getInt(1)); // Set the generated movie ID
            }
        } catch (SQLException e) {
            throw e;
        }
    }

    // Retrieve a movie by ID
    public Movie getMovieById(int movieId) {
        String sql = "SELECT * FROM movie WHERE movie_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, movieId);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return mapToMovie(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Update a movie record
    public void updateMovie(Movie movie) {
        String sql = "UPDATE movie SET title = ?, genre = ?, is_available = ? WHERE movie_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, movie.getTitle());
            statement.setString(2, movie.getGenre());
            statement.setBoolean(3, movie.isAvailable());
            statement.setInt(4, movie.getMovieId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Delete a movie record
    public void deleteMovie(int movieId) {
        String sql = "DELETE FROM movie WHERE movie_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, movieId);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    // Helper method to map ResultSet to Movie object
    private Movie mapToMovie(ResultSet resultSet) throws SQLException {
        Movie movie = new Movie();
        movie.setMovieId(resultSet.getInt("movie_id"));
        movie.setTitle(resultSet.getString("title"));
        movie.setGenre(resultSet.getString("genre"));
        movie.setAvailable(resultSet.getBoolean("is_available"));
        return movie;
    }
    
}













