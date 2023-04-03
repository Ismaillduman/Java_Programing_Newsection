package day_20_arrays_continue_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] a={ 10,56,48,79,42};
        int[] b={1,2,3,4,56,7};
       int [] c= ArraysUtility.merge(a, b);
        System.out.println(Arrays.toString(c));

        double[] d={ 1.2,5.6,4.8,7.9,4.2};
        double[] e={1,2,3,4,56,7};
        double [] f=ArraysUtility.merge(d,e);
        System.out.println(Arrays.toString(f));

        String[] name= {"ismail","duman","busra"};
        String[] name2= {"yusuf","duman","zubeyde"};
        String[] merge=ArraysUtility.merge(name2,name);
        System.out.println(Arrays.toString(merge));


    }
}
