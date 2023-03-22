package day_19;

import java.util.Arrays;

public class MaxMinNum {


    public static void main(String[] args) {


        int[] num = {10, 20, 56, -456, 896, 45, 158964};
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {

            maxNum = Math.max(maxNum, num[i]);
        }
        System.out.println("maxNum = " + maxNum);

        for (int i = 0; i < num.length; i++) {
            if (maxNum < num[i]) {
                maxNum = num[i];
            }

        }
        System.out.println("maxNum Another way = " + maxNum);

        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {

            minNum = Math.min(minNum, num[i]);
        }
        System.out.println("minnum: " + minNum);

        int miNum = 0;
        for (int i = 0; i < num.length; i++) {
            if (miNum > num[i]) {
                miNum = num[i];
            }
        }
        System.out.println("minNum Another way = " + miNum);
    }
}
