package jdbcDemo;

public class Movie {

    private int movieId;
    private String title;
    private String genre;
    private boolean isAvailable;

    // Default constructor
    public Movie() {
    }

    // Constructor with parameters
    public Movie(int movieId, String title, String genre, boolean isAvailable) {
        this.movieId = movieId;
        this.title = title;
        this.genre = genre;
        this.isAvailable = isAvailable;
    }

    // Getter and Setter for movieId
    public int getMovieId() {
        return movieId;
    }
    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    // Getter and Setter for title
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for genre
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Getter and Setter for availability
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

}
