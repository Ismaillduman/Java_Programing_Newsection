package day_24_arrayList_continue;

import java.util.Arrays;
import java.util.Collections;

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

    }
}
