package day_21_multi_dimensional_array;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        int [] arr1={1,2,3,4,5};
        int [] arr2={10,30,40,50};
        int [] arr3={13,23,33,43,53,457};
        int [] arr4={130,203,303,430,530,4570};

        System.out.println("---------------------------------------------------------------\n");
        int [][] arr2d= {arr1,arr2,arr3,arr4};
        for (int i = 0; i < arr2d.length; i++) {
            System.out.println(Arrays.toString(arr2d[i]));
        }
        System.out.println(arr2d.length); // 3

        System.out.println(arr2d[2][3]); // arr3, 43

    }
}
