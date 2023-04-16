package daily_lessons.day_22_wrapper_class_arrayList;

import java.util.ArrayList;

public class IteratingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(50);
        nums.add(30);
        nums.add(12);
        nums.add(120);
        nums.add(3, 300);

        // nums.add(20,23); IndexOutOfBoundsException can not be able to skip index number
        System.out.println(nums); //{10,50,30,300,12,120}
        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            System.out.println(num);
        }

        System.out.println("----------reverse-----------\n");

        for (int i = nums.size() - 1; i >= 0; i--) {
            int num = nums.get(i);
            System.out.println(num);
        }
        System.out.println("---------------------------\n");

        for (Integer num : nums) {
            System.out.println(num);
        }
        for (int num : nums) { //unboxing wrapper to primitive
            System.out.println(num);
        }

    }
}
