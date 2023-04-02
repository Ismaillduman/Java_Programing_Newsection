package reviews.review_08;

import utilities.ArrayListUtility;
import utilities.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class TestUtil {
    public static void main(String[] args) {
        int[][] arr={{3,2,4,2},{1,3},{5,325,123}};
        System.out.println(ArraysUtility.print2D(arr));

        int[] array={3,2,4,2,1,3,5,325,123};
        System.out.println(ArrayListUtility.convertArrayToList(array));

        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("joe", "john", "jane", "jack", "black","rose"));
        System.out.println(Arrays.toString(ArrayListUtility.convertListToArray(developers)));
    }

}
