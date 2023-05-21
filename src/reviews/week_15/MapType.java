package reviews.week_15;



import reviews.week_10.earth.Person;

import java.util.*;

public class MapType {
    public static void main(String[] args) {
        Map<Integer, Person> residents= new LinkedHashMap<>();

        residents.put(1,new Person("Ismail",26));
        residents.put(2,new Person("Kevin",45));
        residents.put(3,new Person("Harry",15));
        residents.put(4,new Person("John",47));

        
        System.out.println(residents);
        for (Integer eachKey : residents.keySet()) {
            System.out.println("In Apartment "+eachKey+" "+residents.get(eachKey).name+" "+" lives there");
        }
        System.out.println("============================================");
        Map<String, List<String>> continents= new HashMap<>();
        continents.put("Asia",new ArrayList<>(Arrays.asList("India", "Nepal","Indonesia","Japan","South Korea")));
        continents.put("Europa",new ArrayList<>(Arrays.asList("Germany", "France","Italy","Spain","Portugal")));
        continents.put("North America",new ArrayList<>(Arrays.asList("US", "Canada","Mexico")));

        for (Map.Entry<String, List<String>> eachEntry : continents.entrySet()) {
            System.out.println("continents: "+eachEntry.getKey());
            System.out.println("\tCountries "+eachEntry.getValue());
        }

        for (List<String> eachValue : continents.values()) {
            for (String eachCountries : eachValue) {
                System.out.println(eachCountries.charAt(0) + eachCountries.charAt(eachCountries.length()-1));
            }
        }
        continents.get("Europa").add("UK");
        System.out.println(continents.get("Europa"));



    }
}
