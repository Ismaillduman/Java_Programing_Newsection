package day_21_multi_dimensional_array;

import utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {

        int []numbers ={1,2,3,4,5};
        System.out.println(ArraysUtility.contains(numbers, 6));
        int element=6;
      numbers=  ArraysUtility.addElement(numbers,element);

        System.out.println(Arrays.toString(numbers));

        double []nums ={1.2,2.2,3.2,4.3,5.8};
        double num=6.06;

        nums=ArraysUtility.addElement(nums,num);
        System.out.println(Arrays.toString(nums));

        String[] family= {"yusuf","damla","zubeyde","ismail","busra","bursa"};
       family= ArraysUtility.addElement(family,"yumak");
        System.out.println(Arrays.toString(family));


    }
}
