package day_23_arrayList_continue;

import java.util.ArrayList;

public class RemoveDuplicate {
    public static void main(String[] args) {

        ArrayList<String> members = new ArrayList<>();

        members.add("Ismail");
        members.add("Yusuf");

        members.add("Zübeyde");
        members.add("Zübeyde");
        members.add("Zübeyde");
        members.add("Busra");
        members.add("Busra");

        ArrayList<String> nonDup = new ArrayList<>();
        for (String each : members) {
            if (nonDup.contains(each)) {
                continue;
            }
            nonDup.add(each);
        }
        members = nonDup;
        System.out.println("nonDup = " + members);


    }
}
