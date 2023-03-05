package replit_tasks.tasks_week_4;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String word= sc.nextLine();
        String result="";
        /* Use `String methods` and `if statements` to reverse a String that is five characters long.
        If the given `word` is not five characters long, it will not be reversed. Use the following to output a value:

> - If the `word` is less than 5 characters: print `Too short!`
> - If the `word` is more than 5 characters: print `Too long!`
> - If the `word` is 5 characters: print the `reversed version` of the String.
 Reading characters from the end to the beginning. */

        if(word.length()==5){
            for (int i = word.length()-1; i >=0; i--) {
                String letters=String.valueOf(word.charAt(i));
                result+=letters;
            }
//          String firstLetter=String.valueOf(word.charAt(0));
//          String secondLetter=String.valueOf(word.charAt(1));
//          String thirdLetter=String.valueOf(word.charAt(2));
//          String fourthLetter=String.valueOf(word.charAt(3));
//          String fivethLetter=String.valueOf(word.charAt(4));
//          result= fivethLetter+fourthLetter+thirdLetter+secondLetter+firstLetter;
        } else if (word.length()<5) {
            result="To short!";
        }else{
            result="Too long!";
        }
        System.out.println(result);
    }
}
