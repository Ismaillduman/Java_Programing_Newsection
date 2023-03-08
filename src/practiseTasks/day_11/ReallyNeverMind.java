package practiseTasks.day_11;

import java.util.Scanner;

public class ReallyNeverMind {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String word=sc.next();

        if(word.endsWith("ly")){
            System.out.println("really??");
        }else{
            System.out.println("never mind");
        }

    }
}
