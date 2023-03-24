package replit_tasks.week_7;

import java.util.Arrays;
import java.util.Scanner;



class Main {
    public static int[] merge(int[] a,int[] b) {


       int[] result = new int[a.length + b.length];


        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int i = a.length, j = 0; i < result.length; i++, j++) {
            result[i] = b[j];
        }

        return result;


    }//








    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = new int[in.nextInt()];
        int [] nums2 = new int[in.nextInt()];
        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(merge(nums, nums2)));
    }
}