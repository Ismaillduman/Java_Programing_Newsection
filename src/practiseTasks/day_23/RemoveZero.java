package practiseTasks.day_23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveZero {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        int countZero=Collections.frequency(numbers,0);
        numbers.removeAll(Arrays.asList(0));
        System.out.println(numbers);
        for (int i = 0; i <countZero; i++) {
            numbers.add(0);
        }
        System.out.println(numbers);
    }}






