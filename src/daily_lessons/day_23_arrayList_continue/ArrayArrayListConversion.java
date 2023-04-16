package daily_lessons.day_23_arrayList_continue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConversion {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println("list = " + list);

        System.out.println("----------------------------------------\n");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Mert", "Can", "Busra", "Yusuf"));
        //System.out.println(students);
        String[] names=students.toArray(new String[0]); // Konvertieren von ArrayList() in Array ,verwendet toArray() method

        System.out.println(Arrays.toString(names));

        System.out.println("-----------------------------------------------------");
        ArrayList<Integer> nums= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Integer[] n=nums.toArray(new Integer[0]);

        System.out.println(Arrays.toString(n));
    }
}
