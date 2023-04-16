package reviews.week_10.book;

public class Book {
    private String title,author,genre;
    private  int chapter,numOfPages;
    private boolean hasMovie;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getChapter() {
        return chapter;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public boolean isHasMovie() {
        return hasMovie;
    }

    public void setHasMovie(boolean hasMovie) {
        this.hasMovie = hasMovie;
    }

    public void setInfo(String title, String author, String genre, int chapter, int numOfPages, boolean hasMovie) {

        setAuthor(author);
       setChapter(chapter);
       setGenre(genre);
       setHasMovie(hasMovie);
       setNumOfPages(numOfPages);

    }

    public  void read(){
        System.out.println("People read "+title+" from "+author);
    }


    public String toString() {
        return getClass().getSimpleName() +
                " title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", chapter=" + chapter +
                ", numOfPages=" + numOfPages +
                ", hasMovie=" + hasMovie +
                '}';
    }

    /*Books [Inheritance]





	- Create a class EBook, a sub class of Book
		define more instance variables:
			- size (double) (mb)
			- on kindle (boolean)

		create a open method

	- Create a class AudioBook, a sub class of Book
		define more instance variables:
			- narrator (String)
			- duration (double)

		create a listen method*/
}
