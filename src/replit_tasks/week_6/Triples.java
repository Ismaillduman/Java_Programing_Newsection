package replit_tasks.week_6;

import java.util.Scanner;

public class Triples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String triples="";
        int count=0;

        for (int i = 0; i < str.length()-2; i++) {

            if(str.charAt(i)==str.charAt(i+1)&&str.charAt(i)==str.charAt(i+2)){
                triples+=str.substring(i,i+3);
                count++;

            }

        }
        System.out.println(count);
    }
}
