package day_20;

import java.util.Arrays;

public class ArrayUtilityMethods {
    public static void main(String[] args) {

//    int nums=0;
//        for (int i = 0; i < score.length; i++) {
//          nums+=+score[i];
//        }
//        System.out.println(nums);

        int[] score = {1, 45, 78, 95, 45, 56, 2589};

        System.out.println(Arrays.toString(score));

        System.out.println("------------------------equals------------------------------\n");

        int[] a1 = {2, 5, 8, 9, 4, 5, 6, 12};
        int[] a2 = {2, 5, 8, 9, 4, 5, 6, 12};

        System.out.println(Arrays.equals(a1, a2));

        char[] ch = {'A', 'B', 'C'};
        char[] ch1 = {'A', 'C', 'B'};
        System.out.println(Arrays.equals(ch, ch1));// order and element muss be same


        int[] num = {1, 45, 78, 95, 45, 56, 2589,0,2,5,3,1,7,9,4};

        System.out.println(Arrays.toString(num));

        Arrays.sort(num);

        System.out.println(Arrays.toString(num));//after sort

        System.out.println("minimum_num: "+ num[0]);
        System.out.println("max_num: "+ num[num.length-1]);


        System.out.println("---------------------\n");

        String[] name2= {"yusuf","duman","zubeyde","busra","damla"};
        String[] name= {"yusuf","damla","zubeyde","duman","busra"};
        Arrays.sort(name);
        Arrays.sort(name2);
        System.out.println(Arrays.toString(name));
        System.out.println(Arrays.equals(name, name2));

        System.out.println("--------------------------------------------------");

        String[] family= {"yusuf","damla","zubeyde","ismail","busra","bursa"};
        System.out.println(Arrays.toString(family));
        Arrays.sort(family);
        System.out.println(Arrays.toString(family));

        int[] num2 = {1, 45, 78, 95, 45, 56, 2589,0,2,5,3,1,7,9,4};
        int[] num4 = {2, 5, 8, 9, 4, 5, 6, 12};
        int [] num3=Arrays.copyOf(num2,25);
        System.out.println(Arrays.toString(num3));



         int [] num5=Arrays.copyOf(num2,num2.length+num4.length);

        for (int i = 0,j=num2.length; i < num4.length; i++,j++) {

            num5[j]=num4[i];
        }

        System.out.println(Arrays.toString(num5));

        System.out.println("-----------------------------------------------------------------------\n");


        char[] ch2 = {'Ü', 'M', 'C'};
        char[] ch3 = {'A', 'C', 'B','F','P','Ü', 'M', 'C'};

        char [] copy=Arrays.copyOf(ch3,9);
        System.out.println(Arrays.toString(copy));

        char [] result=Arrays.copyOfRange(ch3,3,6);
        System.out.println(Arrays.toString(result));

    }
}
