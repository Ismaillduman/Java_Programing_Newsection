package replit_tasks.tasks_week_4;

import java.util.Arrays;
import java.util.Scanner;

public class String_manipulation {
    public static void main(String[] args) {
//        String myStr = "Hello";
//        char result = myStr.charAt(2);
//        System.out.println(result);
        Scanner s = new Scanner(System.in);
        String word = s.next();

        System.out.println(word.startsWith(word));

//        System.out.println("word.toUpperCase() = " + word.toUpperCase());
//        System.out.println("word.toLowerCase() = " + word.toLowerCase());

        //System.out.println(word.indexOf("a"));

        String split= Arrays.toString(word.split(String.valueOf(word.charAt(0))));
        for (int i = 0; i < 1; i++) {
            System.out.println(split);

        }
        int lastIndex=word.length()-1;
        System.out.println(word.replaceFirst(String.valueOf(word.charAt(0)), " ").trim());
        System.out.println(word.replaceFirst(String.valueOf(word.charAt(lastIndex)), " ").trim());

    }
}
