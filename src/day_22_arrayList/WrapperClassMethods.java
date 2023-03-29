package day_22_arrayList;

import java.nio.charset.CharsetEncoder;

public class WrapperClassMethods {
    public static void main(String[] args) {
        /*parse method: returns primitive type , converts String to primitive values
        valueOf method: returns wrapper class object, converts String to wrapper class values
        if i want to use primitive data type in collection and map i should convert these to wrapper class with valueOf method.
        * */

        String str = "20";
        System.out.println(str + 1);//201

        //Integer num= Integer.parseInt(str);  //unboxing
        int num = Integer.parseInt(str); //parse means primitive value
        System.out.println(num + 1); //21

        Integer num2 = Integer.valueOf(str);
        System.out.println(num2);

        System.out.println("--------------------------------------------------------\n");

        String s = "20.5";
        double num3 = Double.parseDouble(s);
        Double num4 = Double.valueOf(s);
        System.out.println(num4);
        System.out.println(num3);
        System.out.println("-------------------------------\n");

        String x = "true";

        boolean r1 = Boolean.parseBoolean(x);
        Boolean r2 = Boolean.valueOf(x);
        System.out.println(r1);
        System.out.println(r2);

        System.out.println("---------------------------------------\n");

        char ch = '@';
        boolean isLetter = Character.isLetter(ch);
        boolean isLowerCaseLetter = Character.isLowerCase(ch);
        boolean isUpperCaseLetter = Character.isUpperCase(ch);
        boolean isDigit = Character.isDigit(ch);
        boolean specialCharacter = !Character.isLetterOrDigit(ch); //special character
        System.out.println("isDigit = " + isDigit);
        System.out.println("isLetter = " + isLetter);
        System.out.println("isLowerCaseLetter = " + isLowerCaseLetter);
        System.out.println("isUpperCaseLetter = " + isUpperCaseLetter);
        System.out.println("specialCharacter = " + specialCharacter);

        System.out.println("----------------------------------------------\n");

        String string= "a1b2c4d5f8";

        int sum=0;
        char chr=' ';
        int number=0;

        for (int i = 0; i <string.length() ; i++) {
            chr= string.charAt(i);
            if(Character.isDigit(chr)){
               number= Integer.parseInt(""+chr);
               sum=sum+number;
            }
        }
        System.out.println(sum);


    }

}
