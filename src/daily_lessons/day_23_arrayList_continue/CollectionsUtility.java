package daily_lessons.day_23_arrayList_continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

      list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        Collections.reverse(list);
        System.out.println(list);
        System.out.println("----------------------------------------------\n");

       ArrayList<String> items= new ArrayList<>();
       items.addAll(Arrays.asList("Eier","Kartopfel","Eis","Milch","Butter","Brot","Pizza","Möhre","Erdbeeren","Eis","Eis"));
       Collections.sort(items);
        System.out.println(items);
        Collections.swap(items,0,items.size()-1);
        System.out.println(items);
        System.out.println(Collections.frequency(items, "Eis"));


    }
}
