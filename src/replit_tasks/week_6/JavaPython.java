package replit_tasks.week_6;

import java.util.Scanner;

public class JavaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int countJava = 0,
                countPython = 0;
        boolean result = true;


        for (int i = 0; i < sentence.length() - 3; i++) {

            if (sentence.substring(i, i + 4).contains("java")) {
                countJava++;
            }

        }

        for (int i = 0; i < sentence.length() - 5; i++) {
            if (sentence.substring(i, i + 6).contains("python")) {
                countPython++;
            }
        }
//        System.out.println("countJava = " + countJava);
//        System.out.println("countPython = " + countPython);
        if (countJava == countPython) {
            result = true;
        } else {
            result = false;
        }
        System.out.println(result);

    }
}
