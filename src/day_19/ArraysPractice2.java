package day_19;

import java.util.Arrays;

public class ArraysPractice2 {


    public static void main(String[] args) {
        int[] num = new int[100];
        System.out.println("num = " + Arrays.toString(num));
//        for (int i = 0,j=10; i < num.length; i++ ,j+=10) {
//            num[i]=j;
//
//        }

        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;

        }
        System.out.println("Arrays.toString(num) = " + Arrays.toString(num));
        int[] num2 = new int[100];

//        for (int i = 0,j=100; i < num2.length; i++,j--) {
//            num2[i]=j;
//        }
        for (int i = 0; i < num2.length; i++) {
            num2[i]=100-i;
        }

        System.out.println("num2 "+Arrays.toString(num2));
    }
}
