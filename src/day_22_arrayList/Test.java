package day_22_arrayList;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
int index=2;
        int[] array= {100,20,300,10,1000,50,-200,400,0};

        int[] removeArray=new int[array.length];
        for (int i = 0; i < array.length; i++) {

            if(i==index){
                continue;
            }
            removeArray[i]=array[i];


        }
        System.out.println(Arrays.toString(removeArray));

        boolean has10= ArraysUtility.contains(array,10);
        System.out.println("has10 = " + has10);


        String[] family={"ismail","zubeyde","Busra","Yusuf","Damla"};
        boolean hasYusuf= ArraysUtility.contains(family,"Yusuf");
        System.out.println("hasYusuf = " + hasYusuf);
    }
}
