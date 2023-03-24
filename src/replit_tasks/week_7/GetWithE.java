package replit_tasks.week_7;

import java.util.Arrays;
import java.util.Scanner;

public class GetWithE {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String[] arr = {scan.next(),scan.next(),scan.next(),scan.next(),scan.next()};
        String[] arr = {"ismail duman", "yumak damla", "busra ay", "yusuf tekin", "damla kedi"};
        System.out.println(Arrays.toString(getWithE(arr)));

    }


    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE

        int j = 0;
        int countE = 0;
        char ch='e';

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toLowerCase().contains("e")) {

                countE++;
            }


        }

        //System.out.println(Arrays.toString(result));

        String[] result = new String[countE];
        for (int k = 0; k < arr.length; k++) {
            if (arr[k].toLowerCase().contains(""+ch)) {

                result[j] = arr[k];
                j++;
            }

        }

        //YOUR CODE ENDS HERE

        return result;
    }
}
