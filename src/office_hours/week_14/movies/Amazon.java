package office_hours.week_14.movies;

public final class Amazon extends StreamingSite{
    public Amazon(String url, double subscriptionAmount, int moviesAvailable) {
        super(url, subscriptionAmount, moviesAvailable);
    }

    @Override
    public void subscribe() {
        System.out.println("For Amazon $19.9");
    }

    @Override
    public void playMovie(Movie movie) {
        System.out.println(movie.getTitle()+" able to watch on Amazon");
    }

    @Override
    void pause() {
        System.out.println("You can pause yor movie on Amazon");
    }
}
