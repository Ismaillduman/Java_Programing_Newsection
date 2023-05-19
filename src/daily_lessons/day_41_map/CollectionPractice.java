package daily_lessons.day_41_map;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<>();
        list1.addAll(Arrays.asList(4,6,8,9,10,25));

        List<Integer> list2= new ArrayList<>();
        list1.addAll(Arrays.asList(40,60,80,90,100,250));

        List<List<Integer>> lists= new ArrayList<>();
        lists.addAll(Arrays.asList(list1,list2));

        System.out.println(lists.get(0).get(3));// 9

        for (List<Integer> eachList : lists) {
            for (Integer eachElement : eachList) {
                System.out.println(eachElement);
            }
        }

        System.out.println("_---------------------------------------------");
List<Set<Integer>> listOfSet= new ArrayList<>();
listOfSet.add(new LinkedHashSet<>());//0
listOfSet.add(new LinkedHashSet<>());//1
listOfSet.add(new LinkedHashSet<>());//2
listOfSet.add(new LinkedHashSet<>());//3
        System.out.println(listOfSet);

        //10,5,20
listOfSet.get(0).addAll(Arrays.asList(1,4,5,78,6));
listOfSet.get(1).addAll(Arrays.asList(25,41,45,78));
listOfSet.get(2).addAll(Arrays.asList(14,78,45,62,14));
listOfSet.get(3).addAll(Arrays.asList(9,6,4,1,25,2,14,2));

        System.out.println(listOfSet);
        System.out.println("----------------------------------------------------");

        int[]arr1= {1,2,4,5,8};
        int[]arr2= {10,20,40,50,80};
 List<int[]> listOfArrays= new ArrayList<>();
 listOfArrays.addAll(Arrays.asList(arr1,arr2));

        System.out.println(listOfArrays.get(1)[2]);//40
        listOfArrays.get(1)[2]=35;
        System.out.println(listOfArrays.get(1)[2]);//35

        System.out.println("----------------------------------------");


    }


}
