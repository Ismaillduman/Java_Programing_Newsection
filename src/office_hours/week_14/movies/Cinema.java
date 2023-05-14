package office_hours.week_14.movies;

import java.util.ArrayList;

public final class Cinema implements PlayMovie {
    /* location, number of theaters, List of Movies*/

    String location;
   int numOfTheaters;
    ArrayList<Movie> movies;

    public Cinema(String location, int numOfTheaters, ArrayList<Movie> movies) {
        this.location = location;
        this.numOfTheaters = numOfTheaters;
        this.movies = movies;

    }

    @Override
    public void playMovie(Movie movie) {
        System.out.println("Moving Starting, please grab your popcorn and turn your phones off");
    }
    public void buyTicket(Movie movie){
if(movie.getRating()==5){
    System.out.println(movie.getTitle()+" cost is $25");
} else if (movie.getRating()==3||movie.getRating()==4) {
    System.out.println(movie.getTitle()+" cost is 20");
}else{
    System.out.println(movie.getTitle()+" cost is 15");
}
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "location='" + location + '\'' +
                ", numOfTheaters=" + numOfTheaters +
                ", movies=" + movies +
                '}';
    }
}
/* print how much a movie ticket is. The cost is based on the rating of the movie.
If it is a 5 the movie costs 25, if it is 3 or 4 it cost 20 and any other rating is 15
 create a toString that will display the information about the Cinema and which Movies are available to watch*/