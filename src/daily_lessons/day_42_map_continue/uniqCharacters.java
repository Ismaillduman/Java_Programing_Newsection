package daily_lessons.day_42_map_continue;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class uniqCharacters {
    public static void main(String[] args) {
uniq("asdfasdgh");
    }
    public static void uniq(String str){
        Map<String, Integer> map= new LinkedHashMap<>();

        for (String each:str.split("")) {
            int frequency= Collections.frequency(Arrays.asList(str.split("")),each);
            if(frequency==1){
            map.put(each,frequency);}
        }
        System.out.println(map);
    }
}
