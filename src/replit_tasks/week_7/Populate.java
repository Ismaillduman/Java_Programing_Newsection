package replit_tasks.week_7;

import java.util.Arrays;
import java.util.Scanner;

public class Populate {
    /*Create a method called `populate()` that will take an int argument and print an
    array that is populated/filled with numbers starting from 1 to the given number.

#### This is a `void` method with an `int` parameter*/
    public static void populate(int population){

        int arr1[]= new int[population];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=i+1;
        }
        System.out.println(Arrays.toString(arr1));

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        populate(n);
    }
}
