package day_22_arrayList;

import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {
        //ArrayList is a collection
        /*Arrays disadvantage is first of all it is size fix, you can not change the size
ArrayList size is flexible that means can be change with add and remove methods
Array List:
Allows us to store objects
Presented in “java.util” package
Size is automatically adjusted (has add and remove functions) dynamic
Does not support primitives

        * */
        int[] array = new int[5];

        array[0] = 10;//{10,0,0,0,0}
        array[1] = 15;//{10,15,0,0,0}
        array[2] = 20;//{10,15,20,0,0}
        array[3] = 40;
        array[4] = 50;

        // array[5]=20; ArrayIndexOutOfBoundsException

        System.out.println(Arrays.toString(array));
    }
}
