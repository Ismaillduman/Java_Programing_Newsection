package day_24_arrayList_continue;

import day_22_wrapper_class_arrayList.ArrayListIntro;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElementFromCollections {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        ArrayList<Integer> lessThanFour= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7));
        for (Integer each : list) {
            if(each<4){
                lessThanFour.add(each);
            }
        }
        list.removeAll(lessThanFour);
        System.out.println(list);
        System.out.println("---------------------------------------------------------");


    }
}
