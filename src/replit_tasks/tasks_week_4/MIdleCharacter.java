package replit_tasks.tasks_week_4;

import java.util.Scanner;

public class MIdleCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        /*Use `String methods` and `if statements` to find the middle character/s of the given `word` variable.
        The value of the `word` will be input from a Scanner, but you only need to interact with the String variable.
        Output in the following format:

#### Note: Odd length words will have one middle character, but even length words will have two middle character,
so use the length of the Strings to determine what the output should be.*/

        if(word.length()%2==0){
            System.out.println("" + word.charAt(word.length() / 2-1) + word.charAt(word.length() / 2));

        }else{
            System.out.println("" + word.charAt(word.length() / 2));
        }
    }
}
