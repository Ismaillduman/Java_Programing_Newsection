package reviews.review_08;

import java.text.DecimalFormat;
import java.util.Arrays;

public class AverageOfNumber {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 2, 3, 4, 5},
                {10, 20, 330, 54, 7, 8},
                {89, 78, 45, 12}
        };

        int sumEach = 0;
        for (int[] d1nums : nums) {
            int sumOfEachArr=0;
            for (int each : d1nums) {

                sumOfEachArr+=each;
            }
            double averageOfEachArr=sumOfEachArr/(double)d1nums.length;
            sumEach+=sumOfEachArr;
            System.out.println("average of: "+Arrays.toString(d1nums)+" "+averageOfEachArr);
        }
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Total Average of numbers: "+df.format((double)sumEach/nums.length));


    }
}
