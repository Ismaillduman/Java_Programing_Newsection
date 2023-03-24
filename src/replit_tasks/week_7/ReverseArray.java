package replit_tasks.week_7;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String[] arr = new String[5];
//        for (int i=0;i<5;i++){
//            arr[i] = input.nextLine();
//        }
        String[] arr = {"hello", "why", "by", "apple", "note"};
        String[] reverseArr = new String[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reverseArr[j]=arr[i];
        }
        System.out.println(Arrays.toString(reverseArr));
    }
}
