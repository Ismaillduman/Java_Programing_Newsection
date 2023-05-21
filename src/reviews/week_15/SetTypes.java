package reviews.week_15;

import java.util.*;

public class SetTypes {
    public static <Char> void main(String[] args) {
        /*2. Set (I): Does not have index number, Does not allow duplcaites

			2.1 HashSet (C): Order is random, accept null

			2.1.1 LinkedHashSet (C): Keeps the insertion order, accepts null

			2.2 TreeSet (C): keeps the sorted order, does not accept null*/

        Set<String> set1 = new HashSet<>();
        set1.add("zebra");
        set1.add("Java");
        set1.add("8");
        set1.add("!hello");
        set1.add(null);
        set1.add("Java");
        set1.add("!hi");
        System.out.println(set1);

        Set<String> set2 = new LinkedHashSet<>();
        set2.add("zebra");
        set2.add("Java");
        set2.add("8");
        set2.add("!hello");
        set2.add(null);
        set2.add("Java");
        set2.add("!hi");
        System.out.println(set2);

        String str="hello";
        String removeDup="";
        Set<String> set3 = new LinkedHashSet<>();
        set3.addAll(Arrays.asList(str.split("")));
        for (String eachCh : set3) {
            removeDup+=eachCh;
        }
        System.out.println(removeDup);

        System.out.println(new LinkedHashSet<>(Arrays.asList(str.split(""))));

//        String removeDup="";
//        char[] strCh= str.toCharArray();
//        for (char each : strCh) {
//            set3.add(each);
//
//        }
//        for (Character each : set3) {
//            removeDup+=each;
//        }


        //System.out.println(set3);

        Set<String> set4 = new TreeSet<>();
        set4.add("zebra");
        set4.add("Java");
        set4.add("8");
        set4.add("!hello");
        //set4.add(null); does not accept null
        set4.add("Java");
        set4.add("!hi");
        System.out.println(set4);


        //Loop

        Set<String> tabs= new HashSet<>();
        tabs.add("INNUN01");
        tabs.add("UBNUWB1");
        tabs.add("NIEJ2");
        // you are on tab INUN01 and you need to switch UBNUWB1 how do you do it

        for (String each : tabs) {
            if(each.equals("UBNUWB1")){
                //switch to that tab

            }
        }

    }
}
