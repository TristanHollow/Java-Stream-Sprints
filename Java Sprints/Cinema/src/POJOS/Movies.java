package POJOS;

import java.util.HashSet;
import java.util.Set;

public class Movies  implements java.io.Serializable {


     private int movieId;
     private String name;
     private String genre;
     private Set bookingses = new HashSet(0);

    public Movies() {
    }

	
    public Movies(int movieId, String name, String genre) {
        this.movieId = movieId;
        this.name = name;
        this.genre = genre;
    }
    public Movies(int movieId, String name, String genre, Set bookingses) {
       this.movieId = movieId;
       this.name = name;
       this.genre = genre;
       this.bookingses = bookingses;
    }
   
    public int getMovieId() {
        return this.movieId;
    }
    
    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getGenre() {
        return this.genre;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public Set getBookingses() {
        return this.bookingses;
    }
    
    public void setBookingses(Set bookingses) {
        this.bookingses = bookingses;
    }




}


