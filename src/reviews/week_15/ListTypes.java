package reviews.week_15;

import java.util.*;

public class ListTypes {
    public static void main(String[] args) {
        /* Java Collection List is an interface that represents an ordered collection of elements
         that allows duplicates
        and can be accessed by index. List provides many methods for adding, removing,
        and modifying elements in the List, as well as performing operations such as searching and sorting.
        List is a versatile and widely used interface that is useful for many types of applications
        and data structures*/
        List<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10, 20, 30, 50, 10, 2, 0, null));
        System.out.println(list);


        List<Integer> list2 = new LinkedList<>();

        list2.addAll(Arrays.asList(10, 20, 30, 50, 10, 2, 0, null));
        System.out.println(list2);

        List<Integer> list3 = new Vector<>();

        list3.addAll(Arrays.asList(10, 20, 30, 50, 10, 2, 0, null));
        System.out.println(list3);



    }
}
