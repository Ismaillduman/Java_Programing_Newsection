package reviews.review_08;

import java.util.ArrayList;
import java.util.Arrays;

public class SumStringToNumber {
    public static void main(String[] args) {
        /*Create a program that will define an ArrayList of String.
         The elements in this ArrayList will be number digits like: "123".
         Calculate the sum of the digits and store them into a new ArrayList of Integers.
          Print all the sums of the digits at the end.

		Ex:
			Input:
			["123, "52", "513"]
			Output:
			[6, 7, 9]
*/
        ArrayList<String> list = new ArrayList<>(Arrays.asList("1203", "502", "513"));
        ArrayList<Integer> sumNum= new ArrayList<>();

        for (String each : list) {
            int sum = 0;

            String[] nums = each.split("");

            for (String eachNum:nums) {
                sum += Integer.parseInt(eachNum);

            }
            sumNum.add(sum);
        }
        System.out.println(sumNum);
    }
}
