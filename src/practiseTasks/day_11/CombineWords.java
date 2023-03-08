package practiseTasks.day_11;

import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first word");
        String word_1= sc.nextLine();
        System.out.println("enter second word");
        String word_2= sc.nextLine();
        if(word_1.substring(word_1.length()-1).equalsIgnoreCase(word_2.substring(0,1))){

            System.out.println(word_1.substring(0,word_1.length()-1)+word_2.substring(0));
        }
    }
}
