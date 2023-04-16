package daily_lessons.day_11_string_continue;

public class StringMethods_3 {
    public static void main(String[] args) {
String w = "java javascript";
        System.out.println(w.replaceAll("j", "f")); //string
        System.out.println(w.replace('j', 'f')); //char
        System.out.println(w.replaceFirst("v", "x")); //String

        String sentence="java is fun , java is cool, java is amazing";
        System.out.println(sentence.replaceFirst(", java", ", python"));
        String sub= "CYDEO School";
        System.out.println(sub.substring(0, 5)); //cydeo
        String s= "Today is sunday , tomorrow is Monday";
        String tomorrow= s.substring(s.lastIndexOf(" ")+1);
        System.out.println("tomorrow = " + tomorrow);

    }
}
