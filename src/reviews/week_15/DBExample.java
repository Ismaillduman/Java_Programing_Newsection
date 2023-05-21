package reviews.week_15;

import java.util.*;

public class DBExample {
    public static void main(String[] args) {

        /*
        * First_Name
        * Last_Name
        * Address
        * */
        Map<String,String> person1= new HashMap<>();
        person1.put("First_Name","Harry");
        person1.put("Last_Name","Potter");
        person1.put("Address","Konrad Adenauer Str.");

        List<Map<String,String>> allPeople= new ArrayList<>();
        allPeople.add(person1);
        allPeople.add(Map.of("First_Name","Hermini","Last_Name","Grincher","Address","London Chinchilla Street"));
        System.out.println(allPeople);

        for (Map<String, String> each : allPeople) {
            System.out.println(each.get("Last_Name"));
        }
    }
}

