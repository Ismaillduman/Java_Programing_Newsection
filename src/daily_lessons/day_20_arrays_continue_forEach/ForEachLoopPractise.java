package daily_lessons.day_20_arrays_continue_forEach;

import java.util.Arrays;

public class ForEachLoopPractise {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int num : nums) {
            if (num % 2 != 0)
                System.out.println(num);
        }


        int[] numbers = {-154, -200, 325687, 445, 5, 6, 7, 45789, 900};
        int maxNum=numbers[0];
        int minNum=numbers[0];
        for (int number : numbers) {
            if(number>maxNum){
                maxNum=number;
            }
        }
        System.out.println("maxNum = " + maxNum);

        for (int number : numbers) {
            if(number<minNum){
                minNum=number;
            }
        }

        int[] a={ 10,56,48,79,42};
        int[] b={1,2,3,4,56,7};

        int[] result=new int[a.length+b.length];

        int j=0;
        for (int i : a) {
            result[j++]=i;
        }
        for (int i : b) {
            result[j++]=i;
        }
        System.out.println(Arrays.toString(result));

        System.out.println("------------------------------------------------------\n");

        String[] names= {"ismail duman","yumak damla","busra ay","yusuf tekin","damla kedi","zubeyde tatli"};

        for (String eachName : names) {
            System.out.println(eachName.toUpperCase().charAt(0)+"."+eachName.toUpperCase().charAt(eachName.lastIndexOf(" ")+1));
        }
      
    }
}
