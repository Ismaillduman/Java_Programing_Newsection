package day_21_multi_dimensional_array;

import java.util.Arrays;

public class Single_vs_MultipleArrays {
    public static void main(String[] args) {
        int[] arr1D0= {1,2,3,4,5};
        int[] arr1D1= {10,20,30,40,50};
        int[] arr1D2= {14,24,34,44,54};
        int[] arr1D3= {11,21,31,41,51};
        int[] arr1D4= {16,26,36,64,65};


        System.out.println(Arrays.toString(arr1D0));
        int[][] arr2D= new int[5][];
        arr2D[0]=arr1D0;
        arr2D[1]=arr1D1;
        arr2D[2]=arr1D2;
        arr2D[3]=arr1D3;
        arr2D[4]=arr1D4;

        System.out.println(Arrays.deepToString(arr2D));



    }
}
