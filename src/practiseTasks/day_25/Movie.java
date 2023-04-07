package practiseTasks.day_25;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    public String country,title,director;
    public String genre;
    public LocalDate releaseDate;
    public ArrayList<String> casts;

    public Movie(String country, String title, String director, String genre, LocalDate releaseDate) {
       casts= new ArrayList<>();
        this.country = country;
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.releaseDate = releaseDate;

    }

   public void addCast(String name){
        casts.add(name);
   }
   public void addCasts(String[] names){
        casts.addAll(Arrays.asList(names));
   }


    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", genre=" + genre +
                ", releaseDate=" + releaseDate +
                ", casts=" + casts +
                '}';
    }

    public static void main(String[] args) {
        Movie movie= new Movie("usa","Avengers","Ismail Duman","Action fantasy",LocalDate.of(2023,5,12));
        System.out.println(movie);
        movie.addCast("Busra");
        movie.addCasts(new String[]{"yusuf","zübeyde","damla"});
        System.out.println(movie);
    }
    /*1. Create a custom class named  Movie:
        Attributes:
            country, title, Genre, releaseDate, director, casts (ArrayList<String>)

        Add a constructor to set the country, title, release date, and director of the Movie

        Actions
            addCast(String): adds the given string argument to the arrayList casts
            addCasts(String[]): adds the given string array argument to the arrayList casts
            toString(): returns the name of country, title, release date, and total number of casts

    2. create a class called TestMovieObjects
            1. create an object of the movie:
                    title: Java Developer: Zero to Hero
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 04/18/2021
                    director: Kuzzat Altay
                    Casts: Ozzy, Ali, Muhtar and 5 more students from your group

        print the full info of the movie
*/

}
