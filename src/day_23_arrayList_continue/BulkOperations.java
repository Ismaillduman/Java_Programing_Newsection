package day_23_arrayList_continue;

import office_hours.week_8.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.addAll(1, numbers);

        System.out.println(list1);
        System.out.println("--------------------------------\n");
        //asList() method on Arrays Utility class can be able to use to pass a collection to ArrayList<>
        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(50, 60, 80, 90, 100, 85));

        //addAll removeAll retainAll accept only collection so that use asList() method when want to add multiple elements
        System.out.println("scores = " + scores);

        System.out.println("-----------------------\n");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Mert", "Can", "Busra", "Yusuf"));
        System.out.println(students);
        students.addAll(2, Arrays.asList("Yusuf", "John"));
        System.out.println(students);

        System.out.println("-----------------------");

        Integer[] nums = {1, 2, 3, 4, 56, 7};
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(nums)); //Arraylist type can not to be primitive type,
        /*
        muss be non primitive
        l1.addAll(Arrays.asList(nums));
       */

        System.out.println(l1);
        System.out.println("------------------------------------\n");

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("joe", "john", "jane", "jack", "busra"));
        System.out.println(employees);
        boolean hasJack = employees.contains("jack");
        boolean hasJoeJane = employees.containsAll(Arrays.asList("joe", "jack"));
        boolean hasBusraYusuf = employees.containsAll(Arrays.asList("busra", "yusuf"));
        System.out.println("hasJoeJane = " + hasJoeJane);
        System.out.println("hasJack = " + hasJack);
        System.out.println("hasBusraYusuf = " + hasBusraYusuf);


    }
}
