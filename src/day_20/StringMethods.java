package day_20;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {


    public static void main(String[] args) {
        String str="Cydeo School";

        char [] ch =str.toCharArray();
        System.out.println(Arrays.toString(ch));


        String str1="I would like to learn java an selenium";
        String [] str2=str1.split(" ");
        String [] str3=str1.split("to ");
        System.out.println(Arrays.toString(str2));
        System.out.println(Arrays.toString(str3));

        String sentence="I love to write code on java";

        String [] sentence0=sentence.split(" ");

        String [] str4= ArraysUtility.reverse(sentence0);

        System.out.println(Arrays.toString(str4));


        String reverseSentence="";

        for (int i = 0; i < str4.length; i++) {
            reverseSentence+=" "+str4[i];
        }
        System.out.println(reverseSentence);

    }
}
