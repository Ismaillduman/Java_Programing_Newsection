package reviews.week_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 7, 86, 4, 5, 6, 5, 47, 5));

//        Iterator<Integer> it= list.iterator();
//        while(it.hasNext()){
//            if(it.next()<5){
//                it.remove();
//            }
//        }
        list.removeIf(p -> p < 5);
        System.out.println(list);
    }
}
