package reviews.review_08;

import java.util.Collections;

public class CommonElements {
    public static void main(String[] args) {
        int[][] numbers= {
                {4,1,24,5},
                {24,1,5,2},
                {4,1,5,1}
        };
        int count=0;
        for (int i = 0,j=0; i < numbers[0].length; i++,j++) {
            int num=numbers[i][j];
            System.out.println(num);
        }

    }
}
