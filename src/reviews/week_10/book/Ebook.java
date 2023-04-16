package reviews.week_10.book;

public class Ebook extends Book {

    private double size;
    private boolean onKindle;

    public void setInfo(String title, String author, String genre, int chapter, int numOfPages, boolean hasMovie,double size, boolean onKindle) {
        setInfo(title,author,genre,chapter,numOfPages,hasMovie);
        setSize(size);
        setOnKindle(onKindle);

    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean isOnKindle() {
        return onKindle;
    }

    public void setOnKindle(boolean onKindle) {
        this.onKindle = onKindle;
    }

    public void open(){
        System.out.println("check your kindel is open");
    }

}
