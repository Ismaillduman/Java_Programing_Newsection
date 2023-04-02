package practiseTasks.day_23;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAhmed {
    public static void main(String[] args) {
        // list = ["John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"];
        ArrayList<String> names= new ArrayList<>(Arrays.asList("John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed","Ahmed","Ahmed"));
        int count=0;
        for (String each : names) {
            if(each.equals("Ahmed")){
                count++;
            }
        }
        for (int i = 0; i <count ; i++) {
            names.remove("Ahmed");
        }
        System.out.println(names);
    }
}
