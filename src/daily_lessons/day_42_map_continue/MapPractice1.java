package daily_lessons.day_42_map_continue;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args) {
        Map<String,Object> employeeMap= new HashMap<>();
        employeeMap.put("Busra","F");
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        // how many female & male employees in the map?
        int femaleCount=0;
        int maleCount=0;
        for (Object eachValue : employeeMap.values()) {
            if(eachValue.equals("F")){
                femaleCount++;
            }else{
                maleCount++;
            }
        }
        System.out.println("maleCount = " + maleCount);
        System.out.println("femaleCount = " + femaleCount);
        System.out.println("======================================================");

        // display the names of all the female employees
//        for (String eachName : employeeMap.keySet()) {
//           if(employeeMap.values().equals("F")){
//               System.out.println(eachName);
//           }
//        }

        for (Map.Entry<String, Object> eachEntry : employeeMap.entrySet()) {
            if(eachEntry.getValue().equals("F")){
                System.out.println(eachEntry.getKey());
            }
        }
        System.out.println("==============================================");
        // update all the "M" values with "Male", "F" values with "Female"

        for (Map.Entry<String, Object> eachEntry : employeeMap.entrySet()) {
            if(eachEntry.getValue().equals("F")){
                eachEntry.setValue("Female");
            }else{
                eachEntry.setValue("Male");
            }
            System.out.println(eachEntry);
        }
        System.out.println("=========================================");


    }
}
