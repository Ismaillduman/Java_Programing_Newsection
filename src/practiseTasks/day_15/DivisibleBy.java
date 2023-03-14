package practiseTasks.day_15;

import java.util.Scanner;

public class DivisibleBy {
    public static void main(String[] args) {
        String divisible15="";
        String divisible3="";
        String divisible5="";
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i%3==0&&i%5==0) {
                divisible15+=" "+i;
            }
            if (i%3==0) {
                divisible3+=" "+i;
            }
            if (i%5==0) {
                divisible5+=" "+i;
            }
        }
        System.out.println(divisible15);
        System.out.println(divisible5);
        System.out.println(divisible3);
    }
}
