package practiseTasks.day_23;

import utilities.ArraysUtility;
import utilities.StringUtility;

import java.util.ArrayList;

public class ExtractChar {
    public static void main(String[] args) {
        ArrayList<Character> letter = new ArrayList<>();
        ArrayList<Character> chSpecial = new ArrayList<>();
        ArrayList<Integer> digit = new ArrayList<>();

        String str = "ABCD123$%#@&456EFG!";
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
//                letter.add(str.charAt(i));
//            }
//        }

        for (int i = 0; i <str.length() ; i++) {
            if(Character.isLetter(str.charAt(i))){
                letter.add(str.charAt(i));
            }
        }
        System.out.println(letter);

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digit.add(Integer.parseInt("" + str.charAt(i)));
            }
        }
        System.out.println(digit);

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetterOrDigit(str.charAt(i))) {
                chSpecial.add(str.charAt(i));
            }
        }
        System.out.println(chSpecial);
    }
}
