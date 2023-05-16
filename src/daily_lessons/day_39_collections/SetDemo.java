package daily_lessons.day_39_collections;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        List<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,50,10,2,0));
        list.addAll(Arrays.asList(10,20,30,50,10,2,0));
        list.addAll(Arrays.asList(10,20,30,50,10,2,0));
        list.addAll(Arrays.asList(10,20,30,50,10,2,0,null));
        System.out.println(list);

        System.out.println("-------------------------------------------------");
        Set<Integer> set1= new HashSet<>();//order is random and not accept the duplicate
      set1.addAll(Arrays.asList(3,10,5,4,6,5,1,250,100,null,null));
        System.out.println(set1);
        System.out.println("------------------------------------------");
        Set<Integer> set2= new LinkedHashSet<>();
        set2.addAll(Arrays.asList(10,20,30,50,10,2,0));
        set2.addAll(Arrays.asList(10,20,30,50,10,2,0));
        set2.addAll(Arrays.asList(10,20,30,50,10,2,0));
        set2.addAll(Arrays.asList(10,20,30,50,10,2,0,null));
        System.out.println(set2);

        Set<Integer> set3= new TreeSet<>();

        set3.addAll(Arrays.asList(10,20,30,50,10,2,0));
        set3.addAll(Arrays.asList(10,20,30,50,10,2,0));
        set3.addAll(Arrays.asList(10,20,30,50,10,2,0));
       // set3.addAll(Arrays.asList(10,20,30,50,10,2,0,null)); not accept null in treeset
        System.out.println(set3);

    }

}
