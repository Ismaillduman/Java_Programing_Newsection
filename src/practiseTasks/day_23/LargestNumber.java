package practiseTasks.day_23;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LargestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> nums= new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(Collections.max(nums));
    }
}
