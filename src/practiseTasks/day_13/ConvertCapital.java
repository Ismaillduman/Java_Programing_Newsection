package practiseTasks.day_13;

public class ConvertCapital {
    /*Create a method named title that takes a string arguments

    The method returns the proper capitalized version of the given argument

    Ex:
        title("jAvA") ===> Java*/
    public static void main(String[] args) {

        System.out.println(capital("JaVa"));

    }

    public static String capital(String word) {
        word = word.toUpperCase().charAt(0)+""+word.substring(1).toLowerCase();
        return word;
    }

    public static void capital() {


    }
}
