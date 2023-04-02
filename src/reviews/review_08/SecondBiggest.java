package reviews.review_08;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondBiggest {
    public static void main(String[] args) {
        ArrayList<Integer> nums= new ArrayList<>(Arrays.asList(4,8,7,8,8));
        //int max = nums.get(0);
        int max= Integer.MIN_VALUE;
        int secondMax= nums.get(0);
        for(int each:nums){
            if(each>max){
                secondMax=max;
                max=each;
            }
            if(each>secondMax&&each<max){
                secondMax=each;
            }
        }
        System.out.println("secondMax = " + secondMax);
        System.out.println("max = " + max);
    }
}
