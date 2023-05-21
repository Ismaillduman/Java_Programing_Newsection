package daily_lessons.day_42_map_continue;

import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingMaps {
    public static void main(String[] args) {
        Map<String,Object> person= new LinkedHashMap<>();

        person.put("name","kevin");
        person.put("gender",'M');
        person.put("age",35);
        person.put("job_title","SDET");
        person.put("salary",72000.00);
        person.put("married",true);

        System.out.println(person);

        System.out.println("==============================================");
        //iterating by the keys

        for (String eachKey : person.keySet()) {
            System.out.println(eachKey);
        }
        System.out.println("=================================================");
        //iterating by the values

        for (Object eachValue : person.values()) {

            System.out.println(eachValue);
        }
        System.out.println("=================================================");

        //iterating by entrySet
        for (Map.Entry<String, Object> eachEntry : person.entrySet()) {
            System.out.println(eachEntry);
        }
        System.out.println("=================================================");

        for (Map.Entry<String, Object> eachEntry : person.entrySet()) {
           String eachKey= eachEntry.getKey();
           Object eachValue=eachEntry.getValue();
            System.out.println(eachKey);
            System.out.println(eachValue);
        }

        System.out.println(person);

    }
}
