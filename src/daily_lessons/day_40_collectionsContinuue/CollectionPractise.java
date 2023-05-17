package daily_lessons.day_40_collectionsContinuue;

import java.util.*;

public class CollectionPractise {
    public static void main(String[] args) {
        List<Integer> list0 = new ArrayList<>();

        List<Integer> list2 = new Stack<>();
        List<Integer> list3 = new Vector<>();
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.addAll(Arrays.asList(1, 5, 4, 3, 8, 9, 45, 12, 45, -5));
        //System.out.println(list1.stream().min(Integer::compareTo).get());

    }
}
