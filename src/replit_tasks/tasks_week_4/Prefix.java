package replit_tasks.tasks_week_4;

import java.util.Scanner;

public class Prefix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        if(str.substring(n).contains(str.substring(0,n))){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
