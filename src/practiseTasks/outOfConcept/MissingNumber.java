package practiseTasks.outOfConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={1, 3, 5, 7, 9, 13};
        ArrayList<Integer> list= new ArrayList<>();
        Arrays.sort(arr);
        list.add(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]+2);
            if(list.get(i)!=arr[i]){
                System.out.println("missing number "+ list.get(i));
            }
        }
    }
}
