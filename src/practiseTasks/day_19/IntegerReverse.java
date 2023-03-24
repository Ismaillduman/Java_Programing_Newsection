package practiseTasks.day_19;

import java.util.Arrays;

public class IntegerReverse {
    public static void main(String[] args) {
        /* Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};*/
        int [] reverse= {1,2,3,4,5};
        for (int i = 0,j=5 ; i < reverse.length; i++,j--) {
            reverse[i]=j;
        }
        System.out.println(Arrays.toString(reverse));
    }
}
