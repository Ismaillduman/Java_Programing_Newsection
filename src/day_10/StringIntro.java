package day_10;


import java.util.Scanner;

public class StringIntro {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Java"; // in java i need not to import only lang package.
        String str_0 = "Java"; // new object in heap in string pool
        System.out.println(str);

        String str_1 = new String("Java"); // new object in heap memory
        String str_2 = new String("Java");


        System.out.println(str == str_1); //false

        System.out.println(str_2 == str_1); //false

        System.out.println(str == str_0);//true

        System.out.println(str_1.equals(str_2)); //true
        System.out.println(str.replaceFirst("v", "J"));

        System.out.println("-----------------------------------------------------------\n\n");

        String obst = "  Banana can eatable      ";

        char firstChar = obst.charAt(0);
        char scndChar = obst.charAt(1);
        char thrdChar = obst.charAt(2);
        char frthChar = obst.charAt(3);
        char fvthtChar = obst.charAt(4);
        char sixthChar = obst.charAt(5);

        System.out.println(firstChar + "" + scndChar + thrdChar + frthChar + fvthtChar + sixthChar);
        System.out.println(obst);
        System.out.println(obst.trim()); //at the beginning of words blank and at the ending of words blank   delete

        String sentence = "Ismail";
        int length = sentence.length();
        int lastIndex = length - 1;
        System.out.println("lastIndex = " + lastIndex + "\n" + "length: " + length);


//        int x =sentence.length()-1;
//        System.out.println(sentence.charAt(x)); //last char

        System.out.println("===========================================================\n");

        Scanner scn = new Scanner(System.in);

        System.out.println("HOw ol are you?");
        int age=scn.nextInt();
        System.out.println("Are you citizen of usa");
        String answer= scn.next();

        if(answer.equals("yes")){
            System.out.println("Eligible");

        }else {
            System.out.println("not eligible");
        }





    }
}
