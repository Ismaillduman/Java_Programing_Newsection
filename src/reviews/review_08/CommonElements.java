package reviews.review_08;

import java.util.Arrays;
import java.util.Collections;

public class CommonElements {
    public static void main(String[] args) {
        int[][] numbers= {
                {4,1,24,5},
                {24,1,5,2},
                {4,1,5,1}
        };

        for (int i = 0; i < numbers[0].length; i++) {
            //System.out.println(numbers[0][i]);
            int count=1;
            for (int j = 1; j <numbers.length ; j++) {
                for (int each : numbers[j]) {
                    if(each==numbers[0][i]){
                        count++;
                        break;
                    }
                }
            }
            if(count== numbers.length){
                System.out.println(numbers[0][i]);
            }
        }

    }
}
