package daily_lessons.day_42_map_continue;

import java.time.LocalDate;
import java.util.*;

public class MapPractice2 {
    public static void main(String[] args) {
        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000.5);
        person1.put("hired_date", LocalDate.of(2021, 1, 15));
        person1.put("married", true);

        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Kevin");
        person2.put("gender", 'M');
        person2.put("age", 40);
        person2.put("job_title", "SDET");
        person2.put("salary", 55000);
        person2.put("hired_date", LocalDate.of(2022, 1, 15));
        person2.put("married", true);

        Map<String, Object> person3 = new LinkedHashMap<>();
        person3.put("name", "Carol");
        person3.put("gender", 'F');
        person3.put("age", 25);
        person3.put("job_title", "QA");
        person3.put("salary", 63000);
        person3.put("hired_date", LocalDate.of(2022, 1, 15));
        person3.put("married", true);

        Map<String, Object> person4 = new LinkedHashMap<>();
        person4.put("name", "jenny");
        person4.put("gender", 'F');
        person4.put("age", 28);
        person4.put("job_title", "PO");
        person4.put("salary", 120000);
        person4.put("hired_date", LocalDate.of(2021, 1, 15));
        person4.put("married", true);

        Map<String, Object> person5 = new LinkedHashMap<>();
        person5.put("name", "Ismail");
        person5.put("gender", 'M');
        person5.put("age", 39);
        person5.put("job_title", "Sdet");
        person5.put("salary", 73000);
        person5.put("hired_date", LocalDate.of(2022, 1, 15));
        person5.put("married", true);

        List<Map<String, Object>> listOfMap = new ArrayList<>();
        listOfMap.add(person1);
        listOfMap.add(person2);
        listOfMap.addAll(Arrays.asList(person3, person4, person5));
        System.out.println(listOfMap.get(1));
        System.out.println("?===================================================");
        for (Map<String, Object> eachMap : listOfMap) {
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                System.out.println(eachEntry);
            }
        }

        System.out.println("=============================================================");
        // display the names of the employee who are hired this year (2022)

        for (Map<String, Object> eachMap : listOfMap) {
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                if(eachEntry.getKey().equals("hired_date")){
                    if(((LocalDate)eachEntry.getValue()).getYear()==2022){
                        System.out.println(eachMap.get("name"));
                    }
                }
            }
        }
        System.out.println("=====================================================");
        listOfMap.get(0).replace("name","Yusuf");
        listOfMap.get(listOfMap.size()-1).replace("salary",((Integer)listOfMap.get(listOfMap.size()-1).get("salary"))+5000);
        listOfMap.get(0).replace("age",(Integer)listOfMap.get(0).get("age")+40);
        System.out.println(listOfMap);
        System.out.println("============================================");
        Map<String, Object> car1 = new LinkedHashMap<>();
        car1.put("brand", "BMW");
        car1.put("model", "X5");
        car1.put("year", 2021);
        car1.put("color", "Red");
        car1.put("price", 45000.5);

        Map<String, Object> car2 = new LinkedHashMap<>();
        Map<String, Object> car3 = new LinkedHashMap<>();
        Map<String, Object> car4 = new LinkedHashMap<>();
        Map<String, Object> car5 = new LinkedHashMap<>();

        List<Map<String,Object>> listOfCarMap= new ArrayList<>(Arrays.asList(car1,car2,car3,car4,car5));

        System.out.println(listOfCarMap);


    }


}
