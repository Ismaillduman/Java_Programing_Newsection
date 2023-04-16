package daily_lessons.day_23_arrayList_continue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethodsPractise {
    public static void main(String[] args) {
//        int[] num1= new int[3]; //garbage collection
//        int[] num2= {1,2,3,4,5};
//
//        num1=num2;
//
//        for (int i = 0; i < num2.length; i++) {
//            System.out.println(num1[i]);
//        }

        int[] array= {1,2,3,4,5};
        array[0]=100; //update the value on the Array

        System.out.println(Arrays.toString(array));

        System.out.println("-------------------------------\n");

        ArrayList<String> family= new ArrayList<>();
        family.add("Ismail");
        family.add("Yumak");
        family.add("Yusuf");
        family.add("Zübeyde");
        family.add("Damla");
        family.add("Busra");

        System.out.println(family);

        // family[1]="Bulut"; can not update with this way

        family.set(1,"Bulut"); // set method to update elements
        System.out.println(family);

        family.add(1,"pamuk"); //not update but shift right
        System.out.println(family);

        family.remove(0);
        System.out.println(family); // shift left

        System.out.println("-------------------------------");

        ArrayList<Integer> numbers= new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);

        boolean r1= numbers.remove(Integer.valueOf(10)); //remove with object as parameter:
        // for that convert the primitive to wrapper class with valueOf() method.

        System.out.println(numbers);
        System.out.println(r1);

        System.out.println("-----------------------------\n");

        ArrayList<String> familyDuman= new ArrayList<>();

        familyDuman.add("Ismail");
        familyDuman.add("Yusuf");
        familyDuman.add("Yusuf");
        familyDuman.add("Yusuf");
        familyDuman.add("Zübeyde");
        familyDuman.add("Zübeyde");
        familyDuman.add("Zübeyde");
        familyDuman.add("Busra");
        familyDuman.add("Busra");


        System.out.println(familyDuman.indexOf("Yusuf"));
        System.out.println(familyDuman.lastIndexOf("Yusuf"));
        System.out.println(familyDuman.lastIndexOf("Zübeyde"));


    }
}
