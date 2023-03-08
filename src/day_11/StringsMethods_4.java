package day_11;

public class StringsMethods_4 {
    public static void main(String[] args) {
        String word= "";
        System.out.println(word.isEmpty()); //true
        System.out.println("=====================================================");
        String word_1=" ";
        System.out.println("word_1.isEmpty() = " +word_1.isEmpty()); //false
        System.out.println("word_1.isBlank() = " + word_1.isBlank()); //true
        System.out.println("=====================================================");
        String word_2="Hallo      ";
        System.out.println(word_2.isEmpty()); //false
        System.out.println("word_2.isBlank() = " + word_2.isBlank());  //false


        String s1="JAVA";
        String s2="java";
        System.out.println(s1.equalsIgnoreCase(s2)); //true
    }
}
