package reviews.week_14;

public class ExceptionExample {
    public static void main(String[] args) {

        try {
            String s= null;
            System.out.println(s.length());
        }catch (NullPointerException e){
            System.out.println("Catch Block");
            System.out.println("Do these steps");
        }

        System.out.println("End");

    }
}
