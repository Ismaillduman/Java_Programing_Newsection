package daily_lessons.day_40_collectionsContinuue;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes  {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );
        Iterator<String> it= names.iterator();

        while(it.hasNext()){
            String each=it.next();
            String reverse="";
            for (int i = each.length() - 1; i >= 0; i--) {
                reverse+= each.charAt(i);
            }

            if(each.equalsIgnoreCase(reverse)){
                it.remove();
            }
        }
        System.out.println("names remove with iterator= " + names);


        //names.removeIf(p-> new StringBuilder(p).reverse().toString().equalsIgnoreCase(p));
        names.removeIf(p-> StringUtility.reverse(p).equalsIgnoreCase(p));
        System.out.println("removeIf "+names);
    }
}
