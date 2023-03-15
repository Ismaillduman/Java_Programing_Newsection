package replit_tasks.week_6;

import java.util.Scanner;

public class WordCount {
    public static int wordCount(String words) {
        // your code
        int wordCount=0;


        for (int i = 0; i < words.length(); i++) {

          if(words.charAt(i)==' ') {

              wordCount++;
          }

        }


return wordCount+1;


    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }
}
