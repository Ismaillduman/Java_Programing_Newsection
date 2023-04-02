package reviews.review_08;

import java.text.DecimalFormat;
import java.util.Arrays;

public class AverageOfNumber {
    public static void main(String[] args) {
        int[][] nums={
                {1,2,3,4,5},
                {10,20,330,54,7,8},
                {89,78,45,12}
        };
        System.out.println(Arrays.deepToString(nums));
int sumEach=0;
        for(int[] d1nums:nums){
            System.out.println(Arrays.toString(d1nums));
           for(int each:d1nums){
               System.out.println(each);
               sumEach+=each;
           }
        }
        DecimalFormat df= new DecimalFormat("0.00");
        double average= sumEach/(double)nums.length;
        System.out.println(df.format(average));
    }
}
