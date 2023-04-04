package practiseTasks.day_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniq {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));
        String results="";

        for (int each : list) {
            int frequency= Collections.frequency(list,each);

         if(!results.contains(""+each)){
             results+=each;
         }
         if(frequency==1){
             System.out.println("uniq number "+each);
         }
        }


    }
}
