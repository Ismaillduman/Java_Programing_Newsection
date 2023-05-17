package daily_lessons.day_40_collectionsContinuue;

import java.util.*;

public class IterablePractise {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmet", "ahmet", "AhmEt", "Mustafa", "Ali", "Busra", "Yusuf", "Damla", "Leena", "Kevin", "Carl", "Ahmet"
        ));

        for (int i = names.size() - 1; i >= 0; i--) {
            if (names.get(i).equalsIgnoreCase("ahmet")) {
                names.remove(i);
            }
        }
        System.out.println("names with for = " + names);

        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String each = it.next();
            if (each.equalsIgnoreCase("ahmet")) {
                it.remove();
            }

        }


        names.removeIf(each -> each.equalsIgnoreCase("Ahmet"));
        System.out.println("with remove if is best practise: " + names);

        System.out.println("===================================================");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 78,78,78, 9, 5, 4, 2, 1, 45, 684, 1, 25, 55, 5, 5));

        int n = 5;
        for (int i = 0; i < n - 1; i++) {
            list3.removeIf(p -> p == Collections.max(list3));
        }

        int max = Collections.max(list3);
        System.out.println("max = " + max);
    }
}
