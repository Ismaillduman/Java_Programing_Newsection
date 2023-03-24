package replit_tasks.week_7;

import java.util.Arrays;

public class UniqNumbers {
    public static void main(String[] args) {

        int[] nums = {2, 5, 5, 6, 3, 6, 9, 34, 3};
        int numbersCount = 1;

        for (int i = 0; i < nums.length; i++) {
            nums[numbersCount]=nums[i];
            numbersCount++;
        }
    }

//    public static int[] returnNonRepeated(int[] arr) {
//        int[] temp = new int[arr.length];
//        int numbersCount = 1;
//        for (int i = 0; i < arr.length; i++) {
//            if (i == 0) {
//                uniques[numbersCount] = arr[i];
//                numbersCount++;
//            } else {
//                if (arr[i] != arr[i - 1]) {
//                    uniques[numbersCount] = arr[i];
//                    numbersCount++;
//                }
//            }
//        }
//
//        return uniques;
    }

