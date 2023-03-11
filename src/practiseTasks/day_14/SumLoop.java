package practiseTasks.day_14;

import java.util.Scanner;

public class SumLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int result= sum(n);
        System.out.println(result);

    }

    public static int sum(int n) {
        int sum=0;
        for (int i = 1; i <= n; i++) {
       sum=sum+i;

        }

        return sum;
    }
}
