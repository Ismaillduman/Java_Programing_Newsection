package office_hours.week_14.movies;

public final class Netflix extends StreamingSite {

    public Netflix(String url, double subscriptionAmount, int moviesAvailable) {
        super(url, subscriptionAmount, moviesAvailable);
    }

    @Override
    public void subscribe() {
        System.out.println("For netflix $19.9");
    }

    @Override
    public void playMovie(Movie movie) {
        System.out.println(movie.getTitle()+" able to watch on Netflix");
    }

    @Override
    void pause() {
        System.out.println("You can pause yor movie on Netflix");
    }
}
