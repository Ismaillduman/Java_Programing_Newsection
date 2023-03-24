package replit_tasks.week_7;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
//        Scanner input = new Scanner(System.in);
//        String[] words = new String[5];
        String [] words= { "aaa", "bbbbb","jaaaaavvaaaaaaaaaa", "whasstupppp", "longg"};
//        for(int i = 0; i < 5;  i++) {
//            words[i] = input.nextLine();
//        }
        //WRITE YOUR CODE BELOW
int longestWord=0;
String longWord="";
        for (int i = 0; i < words.length; i++) {
            if(words[i].toCharArray().length>longestWord){
                longestWord=words[i].length();
                longWord=words[i];
            }
            System.out.println(words[i].toCharArray().length);
        }
        System.out.println(longWord);
        System.out.println(longestWord);
    }
}
