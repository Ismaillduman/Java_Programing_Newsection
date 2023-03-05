package replit_tasks.tasks_week_4;

import java.util.Scanner;

public class JavaPosition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
//        String scnSpeech = "" + word.charAt(1);

        if (word.contains("java")&&word.length()>4) {
            String scnSpeech = "" + word.charAt(1);
            if (word.startsWith("j") || word.startsWith("J")) {
                System.out.println("true");
            } else if (scnSpeech.equalsIgnoreCase("j")) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }else{System.out.println("false");
        }



    }
}