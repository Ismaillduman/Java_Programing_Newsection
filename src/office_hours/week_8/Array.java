package office_hours.week_8;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] array=new int[5];
        array[0]=10;
        array[1]=20;
        array[2]=30;
        array[3]=40;
        array[4]=50;


        int[] shift= new int[array.length];
        shift[array.length-1]=array[0];
        for (int i = 0; i < array.length-1; i++) {
            shift[i]=array[i+1];
        }
        System.out.println(Arrays.toString(array));
        System.out.println("shift = " + Arrays.toString(shift));

        int[] arr= {60,70,80,90};
        int[] shifted= new int[arr.length];
        shifted[shifted.length-1]=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            shifted[i]=arr[i+1];
        }
        System.out.println(Arrays.toString(shifted));
    }
}
