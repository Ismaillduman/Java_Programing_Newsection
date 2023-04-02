package reviews.review_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxMin {
    public static void main(String[] args) {
        ArrayList<Integer> nums= new ArrayList<>(Arrays.asList(4,8,7,8,8));

        int max= Collections.max(nums);
        System.out.println("first max: "+max);
        nums.removeAll(Arrays.asList(max));
        max= Collections.max(nums);
        System.out.println("second max: "+max);

//        int max = nums.get(0);
//        int secondMax= nums.get(0);
//        for(int each:nums){
//            if(each>max){
//                secondMax=max;
//                max=each;
//            }
//            if(each>secondMax&&each<max){
//                secondMax=each;
//            }
//        }
//        System.out.println("secondMax = " + secondMax);
//        System.out.println("max = " + max);


    }
}
