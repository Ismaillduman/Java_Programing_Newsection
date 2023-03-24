package replit_tasks.week_7;

import java.util.Scanner;

public class ItemsTogether {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
//        Scanner input = new Scanner(System.in);
//        String[] arr = new String[8];
        String[] arr = {"apple", "banana", "kiwi", "grape", "milk", "soda", "juice", "coffee"};

//        for (int i=0;i<8;i++){
//            arr[i] = input.nextLine();
//        }

        //WRITE YOUR CODE BELOW:
        String result = "";
        for (int i = 0; i < arr.length - 1; i++) {
            result = arr[i] + ", " + arr[i + 1];
            System.out.println(result);
        }
    }
    /*Given a `String []` `arr`, print a pair of items together in one line until all the pairs are printed.
    A pair is a element and the element next to it. Print each item with a comma in between them.*/
}
