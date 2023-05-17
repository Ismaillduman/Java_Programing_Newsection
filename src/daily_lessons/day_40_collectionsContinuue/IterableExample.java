package daily_lessons.day_40_collectionsContinuue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterableExample {
    public static void main(String[] args) {
        List<Integer> list=  new ArrayList<>();
        list.addAll(Arrays.asList(2,3,1,4,5,6,8,9,4,6));
        List<Integer> list2=new ArrayList<>();

//        for (int i = 0; i <list.size() ; i++) {
//            if(list.get(i)<5){
//               list2.add(list.get(i));
//            }
//        }
//        System.out.println("list2 = " + list2);

//        for (int i = 0; i <list.size() ; i++) {
//            if(list.get(i)<5){
//                list.remove(i);
//            }
//        }

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) < 5) {
                list.remove(i);
            }
        }
        System.out.println("list with reverse For  = " + list);
        list.removeIf(p->p<5);//removeIf apply implicitly iterable
        System.out.println("list with removeIf= " + list);

    }
}
