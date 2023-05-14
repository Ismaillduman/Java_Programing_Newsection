package office_hours.week_14.movies;

import java.util.ArrayList;
import java.util.Arrays;

public class User {
    public static void main(String[] args) {
        Movie movie= new Movie("Lord of the Rings",9,3,2001);
        Movie movie1= new Movie("Harry Potter",8,2,2002);
        Movie movie2= new Movie("End Game",7,3,2022);
        ArrayList<Movie> arrayOfMovies= new ArrayList<>(Arrays.asList(movie,movie1,movie2));

        Cinema cinema= new Cinema("Hürth",2,arrayOfMovies);
        Netflix netflix= new Netflix("netflix.com",19.9,4);
        Amazon amazon= new Amazon("amazonprime.com",8,6);
        Hulu hulu= new Hulu("hulu.com",7.99,5);
        ArrayList<PlayMovie> streamingSites= new ArrayList<>(Arrays.asList(cinema,netflix,amazon,hulu));


        for (PlayMovie each : streamingSites) {
            if(each instanceof Cinema){
                System.out.println(((Cinema) each).movies);
            }
        }

        for (PlayMovie each : streamingSites) {
            if(each instanceof Netflix){
                System.out.println(((Netflix) each).moviesAvailable);
            }
        }

        for (PlayMovie each : streamingSites) {
            if(each instanceof Amazon){
                System.out.println(((Amazon) each).subscriptionAmount);
            }
        }




    }
    /*create a main method and create Movie, Cinema, Netflix, Amazon, & Hulu objects
            create a List of all the StreamingSites used. Then subscribe to them all.
                extra: you can also pause the movie
            create a List of PlayMovie and add multiple different Cinema and StreamingSite objects.
            Then play your favorite movie on all of the options

            create a method to determine which StreamingSite is the best for you.
                parameter: StreamingSite
                return: StreamingSite

                options to check if the site is for you:
                    subscription is the cheapest
                    or has the most number of movies

            create a List of Cinema in your area. A new movie came out and you want to support
            it so you buy a ticket for that movie from every Cinema in your area.

            extra: think about other ways you could use polymorphism to interact with these objects and
            play around with the code*/
}
