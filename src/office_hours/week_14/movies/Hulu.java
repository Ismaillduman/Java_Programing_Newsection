package office_hours.week_14.movies;

public final class Hulu extends StreamingSite {
    public Hulu(String url, double subscriptionAmount, int moviesAvailable) {
        super(url, subscriptionAmount, moviesAvailable);
    }

    @Override
    public void subscribe() {
        System.out.println("For Hulu $19.9");
    }

    @Override
    public void playMovie(Movie movie) {
        System.out.println(movie.getTitle()+" able to watch on Hulu");
    }

    @Override
    void pause() {
        System.out.println("You can pause yor movie on Hulu");
    }
}
