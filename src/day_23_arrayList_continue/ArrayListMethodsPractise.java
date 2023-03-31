package day_23_arrayList_continue;

public class ArrayListMethodsPractise {
    public static void main(String[] args) {
        int[] num1= new int[3]; //garbage collection
        int[] num2= {1,2,3,4,5};

        num1=num2;

        for (int i = 0; i < num2.length; i++) {
            System.out.println(num1[i]);
        }
    }
}
