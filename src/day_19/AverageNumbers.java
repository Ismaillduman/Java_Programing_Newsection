package day_19;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("How many number do you want to enter");
        int size=sc.nextInt();
        int []nums= new int[size];
        int sum=0;

        for (int i = 0; i <size ; i++) {
            System.out.println("Enter your number \""+i+"\"");
            nums[i]=sc.nextInt();
            sum+=nums[i];
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("sum = " + sum);
        double average=sum/(double)size;
        DecimalFormat df= new DecimalFormat("0.00");
        System.out.println("average = " + df.format(average));
    }
}
