package replit_tasks.week_6;

import java.util.Scanner;

public class Reverse {
    public static String reverse(String input){
        //WRITE YOUR CODE BELOW:
String reverseInput="";
        for (int i = input.length()-1; i >=0 ; i--) {
           reverseInput+= ""+input.charAt(i);
        }

return reverseInput;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverse(in.next()));
    }
}
