package practiseTasks.day_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CountryNames {
    public static void main(String[] args) {
        ArrayList<String > countries= new ArrayList<>(Arrays.asList("Afghanistan","Albania","Algeria","Andorra","Angola","Anguilla","Antigua &amp; Barbuda","Argentina","Armenia","Aruba","Australia","Austria","Azerbaijan"));
        countries.removeIf(p->p.length()>=10 );
        System.out.println(countries);

    }
}
