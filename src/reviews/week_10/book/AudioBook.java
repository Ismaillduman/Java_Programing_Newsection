package reviews.week_10.book;

public class AudioBook extends Book {

    private String narrator;
    private double duration;

    public void setInfo(String title, String author, String genre, int chapter, int numOfPages, boolean hasMovie,String narrator, double duration) {
        setInfo(title,author,genre,chapter,numOfPages,hasMovie);
        setDuration(duration);
        setNarrator(narrator);

    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }



    public void listen(){
        System.out.println("From "+narrator+" can being listening for "+duration);
    }
}
