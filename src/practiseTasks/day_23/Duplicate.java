package practiseTasks.day_23;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//        numbers.set(0,2);
//        System.out.println(numbers);
        numbers.addAll(numbers);
        System.out.println(numbers);

    }
}
