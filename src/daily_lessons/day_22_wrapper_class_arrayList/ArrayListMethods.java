package daily_lessons.day_22_wrapper_class_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> nums= new ArrayList<>();

        nums.add(202); // add method automatically convert primitive to wrapper class int --> wrapper class
        nums.add(50);
        nums.add(6);
        nums.add(9);
        nums.add(15);
        nums.add(15);// allow the duplicate element
        System.out.println(nums);
        nums.add(0,1456);
        nums.add(0,1);
        nums.add(2,10);
        System.out.println(nums);

        System.out.println("--------------------------------\n");

        ArrayList<String> names= new ArrayList<>();

        names.add("Busra");
        names.add("Yusuf");
        names.add("Zübeyde");
        names.add("Ismail");
        names.add("Damla");

        System.out.println(names.size());
        System.out.println(names.get(0)); // provide the index number than get the element with get() method
        System.out.println(names.get(names.size()-1)); //get the last element
        System.out.println(names.indexOf("Damla"));

    }
}
