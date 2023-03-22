package day_11_string_continue;

public class StringMethods_2 {
    public static void main(String[] args) {
        String s = "Java Python Javascript Cydeo Python";

        int a = s.indexOf("a");
        int a1 = s.indexOf("a ");
        int a3 = s.indexOf("a Py");
        System.out.println("a3= " + a3);
        System.out.println("a1 = " + a1);
        int a2 = s.substring(2).indexOf("a");
        System.out.println("a2 = " + a2);

        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++");

        String sentence = " i would like to go to the cinema             ";
        System.out.println(sentence.replaceAll(" ", ""));
        System.out.println(sentence.trim());

    }
}
