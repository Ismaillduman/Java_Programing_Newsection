package day_01;

import java.util.HashMap;

public class PrintExecution {
    public static void main(String[] args) {

       // Task2
        String[] names= {"Cydeo","","Yulia","Alena","Lucy","Alexander","","Igor","Sumeye","Madina"};

        for (String name:names
             ) {
            System.out.println(name);
        }

//Task 3
        HashMap<String, String> clasmates= new HashMap<String, String>();

        clasmates.put("USA","John");
        clasmates.put("Deutschland","Schmidt");
        clasmates.put("England","Harry");
        clasmates.put("Portugal","Salvador");
        clasmates.put("Niederland","Haris");

        System.out.println(clasmates);
    }
}
