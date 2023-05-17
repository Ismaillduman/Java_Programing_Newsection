package daily_lessons.day_40_collectionsContinuue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

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
            if(each.equalsIgnoreCase("ahmet")){
                it.remove();
            }

        }


        names.removeIf(each -> each.equalsIgnoreCase("Ahmet"));
        System.out.println("with remove if is best practise: "+names);
    }
}
