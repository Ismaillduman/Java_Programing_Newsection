package day_19;

public class MaxMinNum {


    public static void main(String[] args) {
        int[] num= new int[100];
        int maxNum=Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            num[i]=i;
            maxNum=Math.max(maxNum,num[i]);
        }
        System.out.println("maxNum = " + maxNum);

        int minNum=Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            num[i]=i;
            minNum=Math.min(minNum,num[i]);
        }
        System.out.println(minNum);
    }
}
