package reviews.review_08;

import utilities.ArrayListUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class CountChar {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>(Arrays.asList("java","html","java","typescript","css"));
        System.out.println(ArrayListUtility.countCharInList(list, 's'));


    }


}
