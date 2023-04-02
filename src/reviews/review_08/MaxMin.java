package reviews.review_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxMin {
    public static void main(String[] args) {
        ArrayList<Integer> nums= new ArrayList<>(Arrays.asList(1,2,3,4,56,78,9,899,8));

        int max= Collections.max(nums);
        System.out.println("first max: "+max);
        nums.removeAll(Arrays.asList(max));
        max= Collections.max(nums);
        System.out.println("second max: "+max);

    }
}
