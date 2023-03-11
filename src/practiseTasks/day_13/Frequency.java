package practiseTasks.day_13;

public class Frequency {

    public static void main(String[] args) {
        System.out.println(frequency("java", "java java java java java  typescript "));

    }

    public static int frequency(String word, String sentence) {


        word = word.toLowerCase();
        sentence = sentence.toLowerCase();
        sentence = sentence.replace(" ", "");

        int startLength = sentence.replace(" ", "").length();
        sentence = sentence.replace(word, "");
        System.out.println(sentence);
        return (startLength - sentence.length()) / word.length();
    }
}
