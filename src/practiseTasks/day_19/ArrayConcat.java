package practiseTasks.day_19;

import java.util.Arrays;

public class ArrayConcat {


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5,78,89,456};
        int[] nums2 = {8, 9, 41};
        int[] result = new int[nums1.length + nums2.length];


        for (int i = 0; i < nums1.length ; i++) {
            result[i]=nums1[i];
        }
        for (int i = nums1.length,j=0; i < result.length ; i++,j++) {
            result[i]=nums2[j];
        }



        System.out.println(Arrays.toString(result));
    }
}
