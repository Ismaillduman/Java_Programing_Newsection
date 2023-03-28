package day_21_multi_dimensional_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionalArray2 {
    public static void main(String[] args) {
        int[][] arr2D1 = {{1, 2, 5, 8}, {45, 78}, {89, 56, 45}};
        int[][] arr2D2 = {{10, 20, 50, 0}, {405, 780}, {809, 506, 450}};
        int[][] arr2D3 = {{10, 20}, {5, 80}, {9, 57, 41}};

        int[][][] arr3D = {arr2D1, arr2D2, arr2D3}; //first [] index num 2D , second [] index num of single dimensional Array ,
        // third [] index num elements index

        System.out.println(Arrays.deepToString(arr3D) + "\n");
        System.out.println(Arrays.deepToString(arr3D[1]));
        System.out.println("-----------for loop--------------------------------\n");
        for (int[][] each2D : arr3D) {

            System.out.println(Arrays.deepToString(each2D));
            for (int[] eachArray : each2D) {

                System.out.println(Arrays.toString(eachArray));
                for (int elements : eachArray) {
                    System.out.println(elements);
                }
            }



        }
        System.out.println("--------------one by one--------------------\n");

        System.out.println(arr3D[0][1][0]); //45
        System.out.println(Arrays.toString(arr3D[0][1])); //[45, 78]
        System.out.println(Arrays.toString(arr3D[1][0])); // [10, 20, 50, 0]
        System.out.println(arr3D[1][2][2]); //450
        System.out.println(arr3D[2][2][1]); //57

        System.out.println("---------------for i--------------------- ");

        for (int i = 0; i < arr3D.length; i++) {
            int [][] arr2D= arr3D[i];
            for (int j = 0; j < arr2D.length; j++) {
                int [] arr=arr2D[j];
                for (int k = 0; k < arr.length; k++) {
                    int elements=arr[k];
                    System.out.println(elements);
                }
            }
        }
    }
}
