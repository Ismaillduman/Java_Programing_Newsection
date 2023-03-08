package practiseTasks.day_11;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word= sc.nextLine();
        if(word.startsWith("x")){
            System.out.println(word.replaceFirst("x","a"));

        } else if (word.startsWith("X")) {
            System.out.println(word.replaceFirst("X","a"));
        }

        System.out.println("##################################################################");
        if(word.contains("x")||word.contains("X")){
            System.out.println(word.toUpperCase().replace("X","a"));
        }
    }



    }

