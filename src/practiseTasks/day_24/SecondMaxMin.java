package practiseTasks.day_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondMaxMin {
    public static void main(String[] args) {
        /*Write a program that can display the second maximum and minimum numbers from an arraylist of integers
		ex:
			list = {}

		output:
			second maximum number is 7
			second minimum number is 1*/
        ArrayList<Integer> nums= new ArrayList<>();
        nums.addAll(Arrays.asList(1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8));
       int max=Collections.max(nums);
       nums.removeIf(p->p==max);
       int min=Collections.min(nums);
       nums.removeIf(p->p==min);
        System.out.println("second max: "+Collections.max(nums));
        System.out.println("second min: "+Collections.min(nums));
    }
}
