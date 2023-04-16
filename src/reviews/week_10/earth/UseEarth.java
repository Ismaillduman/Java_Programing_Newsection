package reviews.week_10.earth;

import java.util.ArrayList;
import java.util.Arrays;

public class UseEarth {
    public static void main(String[] args) {
        Earth.asia.add(new Person("ismail", 39));
        Earth.asia.addAll(Arrays.asList(
                new Person("John", 23),
                new Person("Carol", 26)
        ));
        for (Person person : Earth.asia) {
            System.out.println(person);
        }
        System.out.println(Earth.asia.get(0).age);
    }
}
