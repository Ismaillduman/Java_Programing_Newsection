package day_23_arrayList_continue;

import office_hours.week_8.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.addAll(1,numbers);

        System.out.println(list1);
        System.out.println("--------------------------------\n");
        //asList() method on Arrays Utility class can be able to use to pass a collection to ArrayList<>
        ArrayList<Integer> scores= new ArrayList<>();
        scores.addAll(Arrays.asList(50,60,80,90,100,85));

        //addAll removeAll retainAll accept only collection so that use asList() method when want to add multiple elements
        System.out.println("scores = " + scores);

        System.out.println("-----------------------\n");

        ArrayList<String> students= new ArrayList<>();
        students.addAll(Arrays.asList("Mert","Can","Busra","Yusuf"));




    }
}
