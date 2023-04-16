package reviews.week_10.book;

public class AudioBook extends Book {
    /*- narrator (String)
			- duration (double)

		create a listen method*/
    private String narrator;
    private double duration;

    public void listen(){
        System.out.println("From "+narrator+" can being listening for "+duration);
    }
}
