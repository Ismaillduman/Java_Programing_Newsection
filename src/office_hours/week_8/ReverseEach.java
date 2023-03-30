package office_hours.week_8;

import utilities.ArraysUtility;
import utilities.StringUtility;

import java.util.Arrays;

public class ReverseEach {
    public static String[]reverseEach(String[] words){
//
        String reverseWord="";
        for (String word : words) {
            for (int i = word.length()-1; i >=0 ; i--) {
               reverseWord+=word.charAt(i);
                if(i==0){
                    reverseWord+="<>";


                }
            }
        }
        String[] reverseEach= reverseWord.split("<>");
        //System.out.println(reverseWord);
        System.out.println(Arrays.toString(reverseEach));
        return reverseEach;
    }

    public static void reverseWords(String[] words){
        String[] reverseWord=new String[words.length];
        for (int i = 0; i < words.length ; i++) {
            reverseWord[i]=StringUtility.reverse(words[i]);
        }
        System.out.println(Arrays.toString(reverseWord));

    }

    public static void main(String[] args) {

        String[]  words={"can", "you", "join", "the", "team"};

        reverseEach(words);
        reverseWords(words);

    }
}
