package daily_lessons.day_21_multi_dimensional_array;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {
        int [][] arr2D= {{10,20,30},{40,50,25,12},{90,100}};


        for(int i=0;i< arr2D.length;i++){// i is one dimensional array

            int[] each1D= arr2D[i];
            System.out.println(Arrays.toString(each1D));

            for (int j = 0; j < each1D.length; j++) { //j is index number of elements in each one dimensional array
                int eachElement=each1D[j];
                System.out.println(eachElement);
            }

//            for (int each : each1D) {
//                System.out.println(each);
//            }

        }

        System.out.println("-------------for each--------------------------\n");
        for (int[] each_1D : arr2D) {
            System.out.println(Arrays.toString(each_1D));
            for (int eachElement : each_1D) {
                System.out.println(eachElement);
            }
        }
        System.out.println("--------reverse order--------------------\n");

        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) { //reverse order
                System.out.println(arr2D[i][j]);
            }
        }
    }
}
