package replit_tasks.week_7;

import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        String firstLast="";
        for (int i = 0; i < words.length; i++) {
            firstLast+="\n"+words[i].charAt(0)+words[i].charAt(words[i].length()-1);
        }
        System.out.println(firstLast.trim());
    }
}
