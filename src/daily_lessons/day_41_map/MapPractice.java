package daily_lessons.day_41_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<String,Object> person1= new LinkedHashMap<>();

        person1.put("name","kevin");
        person1.put("gender",'M');
        person1.put("age",35);
        person1.put("job_title","SDET");
        person1.put("salary",72000.00);
        person1.put("married",true);
        System.out.println(person1);

        System.out.println(person1.get("name"));
        System.out.println(person1.get("salary"));
        System.out.println(person1.get("job_title"));
    }
}
