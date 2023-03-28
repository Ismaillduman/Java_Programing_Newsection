package day_21_multi_dimensional_array;

import practiseTasks.day_18.TestOffer;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="heart";
        String str2="earth";

//        char []str=new char[str1.length()];
//        for (int i = 0; i <str1.length() ; i++) {
//          str[i] =str1.charAt(i);
//        }


        char[] a1= str1.toCharArray();
        char[] a2= str2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        boolean isAnagram= Arrays.equals(a1,a2);

        System.out.println("isAnagram = " + isAnagram);

    }
}
