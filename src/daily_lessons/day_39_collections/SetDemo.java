package daily_lessons.day_39_collections;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 30, 50, 10, 2, 0));
        list.addAll(Arrays.asList(10, 20, 30, 50, 10, 2, 0));
        list.addAll(Arrays.asList(10, 20, 30, 50, 10, 2, 0));
        list.addAll(Arrays.asList(10, 20, 30, 50, 10, 2, 0, null));
        System.out.println(list);

        System.out.println("-------------------------------------------------");
        Set<Integer> set1 = new HashSet<>();//order is random and not accept the duplicate
        set1.addAll(Arrays.asList(3, 10, 5, 4, 6, 5, 1, 250, 100, null, null));
        System.out.println(set1);
        System.out.println("------------------------------------------");
        Set<Integer> set2 = new LinkedHashSet<>();
        set2.addAll(Arrays.asList(10, 20, 30, 50, 10, 2, 0));
        set2.addAll(Arrays.asList(10, 20, 30, 50, 10, 2, 0));
        set2.addAll(Arrays.asList(10, 20, 30, 50, 10, 2, 0));
        set2.addAll(Arrays.asList(10, 20, 30, 50, 10, 2, 0, null));
        System.out.println(set2);

        Set<Integer> set3 = new TreeSet<>();

        set3.addAll(Arrays.asList(10, 20, 30, 50, 10, 2, 0));
        set3.addAll(Arrays.asList(10, 20, 30, 50, 10, 2, 0));
        set3.addAll(Arrays.asList(10, 20, 30, 50, 10, 2, 0));
        // set3.addAll(Arrays.asList(10,20,30,50,10,2,0,null)); not accept null in treeset
        System.out.println(set3);
        System.out.println("-------------------------------------------------------");

        String[] words = {"Java", "Java", "Java", "Python", "C#", "c++", "Ruby", "C#", "C#"};
        LinkedHashSet<String> result = new LinkedHashSet<>(Arrays.asList(words));
        System.out.println(result);
        System.out.println("==============================");

        words= result.toArray(new String[0]); //from Set to Array
        System.out.println(words);
        System.out.println("------------------------------------");
        //System.out.println(result.get(1)); set hast not size number
//        for (String each : result) {
//            System.out.println(each);
//        }
        System.out.println(new ArrayList<>(result).get(1));// to get size number i use ArrayList
        System.out.println("-----------------------------------------------------");
        List<Integer> numbers= new ArrayList<>();
        numbers.addAll(Arrays.asList(10,10,10,10,20,20,20,30,30,52,0,14,2));
        SortedSet<Integer> n= new TreeSet<>(numbers); //list to Set
        System.out.println(n);
    }

}
