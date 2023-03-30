package practiseTasks.day_22_array_list;

import java.util.ArrayList;

public class MaxMin {
    public static void main(String[] args) {
        /*Write a program that can find the maximum & minimum numbers from an ArrayList of integers
        Ex:
            list = [1,2,3,4,5];

            output:
                Maximum number is 5
                Minimum number is 1*/
        ArrayList<Integer> nums= new ArrayList<>();

        nums.add(1);
        nums.add(20);
        nums.add(3);
        nums.add(-4);
        nums.add(5);
        int max=nums.get(0);
        int min=nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i)>max){
                max=nums.get(i);
            }if(nums.get(i)<min){
                min=nums.get(i);
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}
