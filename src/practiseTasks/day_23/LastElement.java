package practiseTasks.day_23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LastElement {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5));

        for (Integer each : list) {
            if(each==list.get(list.size()-1)){
                each=0;
            }
            System.out.println(each);
        }

        list.set(list.size()-1,0);
        System.out.println("list "+list);
    }
}
