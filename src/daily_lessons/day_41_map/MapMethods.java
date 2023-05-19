package daily_lessons.day_41_map;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {
        Map<String,String> map= new TreeMap<>();
        map.put("F02","John");
        map.put("B03", "Nora");
        map.put("A02", "Johnson");
        map.put("D02", "Mary");
        map.put("A03", "Carl");
        map.put("A04", "Tatiana");
        map.put("A05", "Carl");
        map.put("A06", "Tatiana");
        map.put("A07", "Tatiana");

        System.out.println(map.size());
        System.out.println(map);

        System.out.println(map.get("A07"));
        System.out.println(map.get("Carl"));//null call with key not value

        map.put("A06","Ismail"); //can update with put method
        map.replace("A04","Carlson");//to update best practise and faster way replace method

        System.out.println(map);

        System.out.println(map.containsKey("B03"));//true
        System.out.println(map.containsKey("T03"));//false

        System.out.println(map.containsValue("Carl"));//true
        System.out.println(map.containsValue("Johny"));//false

        System.out.println(map.isEmpty());//false

        System.out.println(map.equals(map));//true
        map.clear();
        System.out.println(map);
    }
}
