package day_14;

public class ConcatTogether {
    public static void main(String[] args) {
        String str=combine("one", "eight");
        System.out.println(str);
    }

    public static String combine(String word_0, String word_1) {

        String result = "";

        if (word_0.endsWith("" + word_1.charAt(0))) {
            result = word_0.concat(word_1.substring(1));

        } else{
            result=word_0+word_1;
        }
        return result;
    }
}
