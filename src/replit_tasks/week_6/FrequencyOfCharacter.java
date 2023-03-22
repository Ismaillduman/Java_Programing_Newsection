package replit_tasks.week_6;

import java.util.Scanner;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str){


        String result="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);

            int frequency=0;
            for (int j = 0; j < str.length(); j++) {
                if(ch==str.charAt(j)){
                    frequency++;

                }

            }

//            if(!result.contains(""+ch)){
//                result+=frequency+""+ch;
//            }
            if(result.contains(""+ch)){
               continue;
            }
            result+=frequency+""+ch;
        }

return result;

    }
}
