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

        System.out.println("-----------------------------");
        ArrayList<Integer> list1= new ArrayList<>();
        ArrayList<Integer> list2= list1;
        list1.add(10);

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1==list2);

        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();

        l1.add(10);
        l2.add(10);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l2==l1); //false they have same elements but different reference on the heap memory so that these are not == same object,
        // but we can use to compare to arraylist equal method

        System.out.println(l2.equals(l1)); //true
        System.out.println("------------------------------\n");

        ArrayList<Integer> n1=new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);
        n1.add(40);
        ArrayList<Integer> n2=new ArrayList<>();
        n2.add(40);
        n2.add(30);
        n2.add(10);
        n2.add(20);

        System.out.println(n1.equals(n2)); //false order muss be same to equal but firstly i can use sort method..
        System.out.println(n1.isEmpty());
        System.out.println(n2.isEmpty());
        n1.clear();
        n2.clear();
        System.out.println(n1.isEmpty());
        System.out.println(n2.isEmpty());



    }
}
