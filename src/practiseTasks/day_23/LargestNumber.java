package practiseTasks.day_23;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LargestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 8));
        int n = 5;
        int fifthMax;
        Collections.sort(nums);
        for (int i = 0; i < nums.size(); i++) {
            if (Collections.frequency(nums, nums.get(i)) != 1) {
                nums.remove(nums.get(i));
            }
        }
        fifthMax = nums.get(nums.size() - n);
        System.out.println(fifthMax);

        System.out.println("---------------------------------------------");
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 8));

        int x = 5;

        for (int i = 1; i < x; i++) {
            list.removeAll(Arrays.asList(Collections.max(list)));
        }

        System.out.println(Collections.max(list));


    }
}
