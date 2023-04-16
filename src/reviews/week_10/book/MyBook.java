package reviews.week_10.book;

public class MyBook {
    public static void main(String[] args) {
        AudioBook audioBook = new AudioBook();
        audioBook.setInfo("Harry potter", "J:K Rowling", "Fantasy", 8, 540, true, "Stephen Fly", 180);
        System.out.println(audioBook);

        Ebook ebook = new Ebook();
ebook.setInfo("Lord of the rings","j.r.r Tolkien","fantasy",3,840,true,14.02,true);
ebook.setOnKindle(true);
ebook.open();
        System.out.println(ebook);
    }
}
