package office_hours.week_14.movies;

public final class Movie {
    /*create the following instance variables:
                title, rating(out of 5), duration(minutes), year

            create a constructor to initialize all the variables

            encapsulate the class

            create a toString to print the information of the Movie*/
    private String title;
    private int rating,duration,year;

    public Movie(String title, int rating, int duration, int year) {
        this.title = title;
        this.rating = rating;
        this.duration = duration;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", duration=" + duration +
                ", year=" + year +
                '}';
    }
}
