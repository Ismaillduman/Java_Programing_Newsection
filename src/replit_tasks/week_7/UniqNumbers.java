package replit_tasks.week_7;

import java.util.Arrays;

public class UniqNumbers {
    public static void main(String[] args) {

        int[] nums = {2, 5, 5, 6, 3, 6, 9, 34, 3};
        int counter,found;

        for (int i = 0; i < nums.length; i++) {
            counter=1;
            found=0;
            for (int j = 0; j < nums.length; j++) {
                if(j>=i){

                if(nums[i]==nums[j]&&i!=j){
                    counter++;
                }
                } else if(nums[i]==nums[j]){

                    found=1;
                }
            }
            if(counter==1&&found!=1){
                System.out.println(nums[i]);
            }

        }



//        for (int i = 0; i < nums.length; i++){
//            int flag = 0;
//            int count = 0;
//
//            for (int j = i+1; j < nums.length; j++){
//                if (nums[i] == nums[j]){
//                    flag = 1;
//
//                    break;
//                }
//            }
//
//
//            // The continue keyword is used to end the current iteration
//            // in a for loop (or a while loop), and continues to the next iteration
//            if (flag == 1)
//                continue;
//
//            for (int j = 0;j<=i;j++){
//                if (nums[i] == nums[j])
//                    count++;
//
//            }
//            if(count==1){
//                System.out.println(nums[i]);
//            }
//
//
//
//
//       // System.out.println(count);
//        }
    }}


