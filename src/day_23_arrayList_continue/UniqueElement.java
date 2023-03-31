package day_23_arrayList_continue;

import java.util.ArrayList;

public class UniqueElement {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<>();

        names.add("Ismail");
        names.add("Yusuf");

        names.add("Zübeyde");
        names.add("Zübeyde");
        names.add("Zübeyde");
        names.add("Busra");
        names.add("Busra");

        for (String each : names) {
            if(names.indexOf(each)==names.lastIndexOf(each)){
                System.out.println(each +" is unique");
            }
        }

        boolean hasIbrahim= names.contains("Ibrahim");
        boolean hasBusra= names.contains("Busra");
        System.out.println("hasBusra = " + hasBusra);
        System.out.println("hasIsmail = " + hasIbrahim);
    }
}
