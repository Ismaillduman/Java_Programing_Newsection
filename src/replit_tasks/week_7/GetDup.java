package replit_tasks.week_7;

import java.util.Arrays;
import java.util.Scanner;

public class GetDup {
    public static int getDup(String[] arr) {

        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (str == arr[j]) {
                    count++;
                    break;

                }
            }

        }


        return count;


    }

    public static void main(String[] args)  {
//        Scanner in = new Scanner(System.in);
//        String[] strs = new String[in.nextInt()];

//        for (int i = 0; i < strs.length; i++) {
//            strs[i] = in.next();
//        }
//        in.close();


        String [] strs ={"1","2","aa","1","2","b","2","1","1"};
        System.out.println(getDup(strs));


    }

}
