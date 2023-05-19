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

        Collection<Integer> collection= new ArrayList<>(Arrays.asList(1,2,5,4,7,8,96,44,55));
        System.out.println(((ArrayList) collection).get(2));

        System.out.println("=========================================================");
        Collection<Integer> collection2 = new HashSet<>();
        collection2.addAll(Arrays.asList(100, 200, 100, 200, 300, 400, 500, 600, 700, 100, 100, 100));

        System.out.println(collection2);

        ArrayList<Integer> arrayList= new ArrayList<>(collection2);
        System.out.println(arrayList.get(4));
    }
}
