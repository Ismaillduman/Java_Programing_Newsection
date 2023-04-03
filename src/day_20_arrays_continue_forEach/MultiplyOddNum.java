package day_20_arrays_continue_forEach;

import java.util.Arrays;

public class MultiplyOddNum {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]%2!=0){
//                nums[i]=nums[i]*2;
//            }

            if(nums[i]%2==0){
                continue;
            }
            nums[i]=nums[i]*2;
        }
        System.out.println(Arrays.toString(nums));
    }
}
