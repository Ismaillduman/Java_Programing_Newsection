package practiseTasks.day_16;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String value");
        String str = sc.nextLine();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {

                    frequency++;


                }

            }
            if (!result.contains("" + ch)) {
                result += "" + ch + frequency;
            }
        }

        System.out.println(result);

    }
}
