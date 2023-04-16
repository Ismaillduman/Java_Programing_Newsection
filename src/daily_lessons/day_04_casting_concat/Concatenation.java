package daily_lessons.day_04_casting_concat;

public class Concatenation {
    public static void main(String[] args) {
        String first= "Hello ";
        String second = "World";
        String lesson="Physic";

        String third= first.concat(second); //that's away

        System.out.println("third = " + third);

        String sentence = String.join("<", "I","would","like","to","be","a",lesson,"teacher"); //thats an other way
        System.out.println(sentence);
    }
}
