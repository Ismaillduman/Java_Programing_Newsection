package replit_tasks.week_5;

import java.time.chrono.MinguoDate;
import java.util.Scanner;

public class CoverMe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(coverString(in.nextLine(), in.nextLine()));
    }

    public static String coverString(String main, String coverMe) {
        // your code here

if(!main.contains(coverMe)){
    System.out.println("["+main+"]");
    return main;
}else {
    String cover= main.replaceAll(coverMe,"["+coverMe+"]");
    System.out.println(cover);
    return  cover;
}





    }
}
