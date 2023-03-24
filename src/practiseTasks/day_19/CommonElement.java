package practiseTasks.day_19;

import java.util.Arrays;

public class CommonElement {
    public static void main(String[] args) {
        /*arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}*/
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};


        int[] newArr = new int[arr1.length];
        int k=0;
        for (int i = 0; i < arr1.length; i++) {


            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    newArr[k++] = arr1[i];
                }
            }

        }
        System.out.println(Arrays.toString(newArr));
    }
}
