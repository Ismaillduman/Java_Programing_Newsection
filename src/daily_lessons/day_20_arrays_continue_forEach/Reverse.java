package daily_lessons.day_20_arrays_continue_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5,6,7,8,9};
        nums= ArraysUtility.reverse(nums);
        System.out.println(Arrays.toString(nums));

        double [] nums1={1,2,3,4,5,6,7,8,9};
        nums1= ArraysUtility.reverse(nums1);
        System.out.println(Arrays.toString(nums1));

        String[] name2= {"yusuf","duman","zubeyde"};
        name2=ArraysUtility.reverse(name2);
        System.out.println(Arrays.toString(name2));


        char[] name= {'y','d','z'};
        name=ArraysUtility.reverse(name);
        System.out.println(Arrays.toString(name));
    }
}
