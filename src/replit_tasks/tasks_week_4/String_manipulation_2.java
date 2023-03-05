package replit_tasks.tasks_week_4;

import java.util.Arrays;
import java.util.Scanner;

public class String_manipulation_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String word=sc.nextLine();

        if(word.length()==2){

            char a = word.charAt(0);
            String halfOfWord=""+a;
            System.out.println(halfOfWord.repeat(2));

        }else{
            char a= word.charAt(0);
            char b=word.charAt(1);
            String halfOfWord=""+a+b;
            System.out.println(halfOfWord.repeat(2));
        }

        System.out.println("==================================================\n");
        System.out.println(word.substring(0, word.length() / 2));

    }
}
