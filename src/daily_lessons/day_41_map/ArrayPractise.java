package daily_lessons.day_41_map;

import office_hours.week_8.Array;

import java.util.*;

public class ArrayPractise {
    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<>();
        List<Integer> list2= new ArrayList<>();
        List<Integer> list3= new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,4,5,78,96,74));
        list2.addAll(Arrays.asList(7,8,9,70,10,11));
        list3.addAll(Arrays.asList(9,8,1,5,4,8,3));

        List<Integer>[] arrayOfList= new List[3];
        arrayOfList[0]=list1;
        arrayOfList[1]=list2;
        arrayOfList[2]=list3;
        System.out.println(Arrays.toString(arrayOfList));

        System.out.println("arrayOfList[0].get(5) = " + arrayOfList[0].get(5));
        arrayOfList[1].set(3,80);
        System.out.println(Arrays.toString(arrayOfList));

        Set<Integer>[] arrayOfSet= new Set[5];
        arrayOfSet[0]= new LinkedHashSet<>();
        arrayOfSet[1]= new LinkedHashSet<>();
        arrayOfSet[2]= new LinkedHashSet<>();
        arrayOfSet[3]= new LinkedHashSet<>();
        arrayOfSet[4]= new LinkedHashSet<>();


        System.out.println(Arrays.toString(arrayOfSet));
        arrayOfSet[2].addAll(Arrays.asList(1,2,4,5,78));
        System.out.println(Arrays.toString(arrayOfSet));


    }
}
