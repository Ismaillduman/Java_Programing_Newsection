package daily_lessons.day_42_map_continue;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class tasks {
    public static void main(String[] args) {
        String str = "Hello, World!";
        frequency(str);
    }

    public static void frequency(String str) {
        Map<String, Integer> map = new LinkedHashMap<>();
        //Map<Character, Integer> map = new LinkedHashMap<>();
//        for (char each : str.toCharArray()) {
//            if (map.containsKey(each)) {
//                map.put(each, map.get(each) + 1);
//            } else {
//                map.put(each, 1);
//            }
//        }

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            map.put(each,frequency);
        }
        System.out.println(map);
    }
}
