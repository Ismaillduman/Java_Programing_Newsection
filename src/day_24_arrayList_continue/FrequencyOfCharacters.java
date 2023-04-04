package day_24_arrayList_continue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str= "aaassssdddd";
        String result= "";


        for (String each : str.split("")) {
            int frequency= Collections.frequency(Arrays.asList(str.split("")),each);
            if(!result.contains(each)){
                result +=each+ frequency;
            }
        }
        System.out.println(result);
        System.out.println("-------------------------------------------");

      String[] nums= {"1","2","3","3","3","2","2","5","5"};
      String results="";
        for (String each:nums) {
            int count= Collections.frequency(Arrays.asList(nums),each);
            if(!results.contains(each)){
                results+=each+count;
            }
        }
        System.out.println(results);





    }
}
