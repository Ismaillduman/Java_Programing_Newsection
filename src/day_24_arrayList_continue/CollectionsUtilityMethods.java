package day_24_arrayList_continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {
    public static void main(String[] args) {
        ArrayList<String> meetings= new ArrayList<>();
        meetings.addAll(Arrays.asList("grooming","retro","daily","sprint planning","review"));
        System.out.println(meetings);


//        for (int i = 0; i < meetings.size(); i++) {
//            if(meetings.get(i).equals("daily")){
//                meetings.set(i,"scrum");
//            }
//        }


        Collections.replaceAll(meetings,"daily","scrum");
        System.out.println(meetings);
        System.out.println("----------------------------------\n");

        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,2,2,2,4,5,1,1,6,8,9,9));
        int count= Collections.frequency(list,2);
        System.out.println(count);

    }
}
