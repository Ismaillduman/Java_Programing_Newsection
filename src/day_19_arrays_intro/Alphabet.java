package day_19_arrays_intro;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        char [] ascending=new char[26];
        char []descending= new char[26];
        for (int i = 0,j='A',z='Z'; i < ascending.length; i++,j++,z--) {
            ascending[i]= (char) j;
            descending[i]= (char) z;
        }
        System.out.println(Arrays.toString(ascending));
        System.out.println(Arrays.toString(descending));

        System.out.println("---------------------------------------------");

        char[] characters= new char[65535];
        for (int i = 0; i < characters.length; i++) {
            characters[i]= (char) i;
        }
        System.out.println(Arrays.toString(characters));



    }
}
