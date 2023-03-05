package replit_tasks.tasks_week_4;

import java.util.Scanner;

public class Combaine {
    public static void main(String[] args) {
        /*Use `String methods` and `if statements` to  combine the two given String variables,
        `word1` and `word2` together, but only combine them if the Strings are only three character long.
        If either String is not three characters long, do not merge them together and instead print `cannot merge`.
        If both Strings are three characters long then merge them together in the following format and
        print the merged String:

#### The Strings will be merged by taking the first character of the first word,
then the first character of the second word, then the second character of the first word, etc*/

        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
String combine="";
        if(word1.length()==3&&word2.length()==3){

            combine=""+word1.charAt(0)+word2.charAt(0)+word1.charAt(1)+word2.charAt(1)+word1.charAt(2)+word2.charAt(2);
            System.out.println(combine);
        }else{
            System.out.println("cannot merge");
        }


    }}
