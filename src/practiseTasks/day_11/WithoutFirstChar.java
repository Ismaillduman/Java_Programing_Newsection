package practiseTasks.day_11;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first word");
        String word_1= sc.nextLine();
        System.out.println("enter second word");
        String word_2= sc.nextLine();
        System.out.println(word_1.substring(1) + word_2.substring(1));

    }
}
