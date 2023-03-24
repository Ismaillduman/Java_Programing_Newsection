package office_hours.week_5;

import java.util.Scanner;

public class LongestWithA {
    /*Create a program that will ask the user to enter 3 words.
	Find the word that contains 'a' and is the longest out of the others

	ex:
		java
		mouse
		computer

	Output: java

	Extra: Instead of just checking for "a" ask the enter to enter the character that should be used to determine the result*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 3 words");
        String firstWord = sc.next(),
                secondWord = sc.next(),
                thirdWord = sc.next();
        System.out.println("check that letter");
        String letter = sc.next();
        String longest="";

        if(firstWord.contains(letter)&&firstWord.length()>longest.length()){
            longest=firstWord;
        } if(secondWord.contains(letter)&&secondWord.length()>longest.length()){
            longest=secondWord;
        } if(thirdWord.contains(letter)&&thirdWord.length()>longest.length()){
            longest=thirdWord;
        }else {
            System.err.println("words contains not that letter");
        }
        System.out.println("longest = " + longest);





//        if (!firstWord.contains(letter) && !secondWord.contains(letter) && !thirdWord.contains(letter)) {
//            System.err.println("words contains not that letter");
//            return;
//        }
//        if (firstWord.contains(letter) && secondWord.contains(letter) && thirdWord.contains(letter)) {
//            if (firstWord.length() > secondWord.length() && firstWord.length() > thirdWord.length()) {
//                System.out.println(firstWord);
//            } else if (secondWord.length() > thirdWord.length()) {
//                System.out.println(secondWord);
//            } else {
//                System.out.println(thirdWord);
//            }
//            return;
//        }
//        if (firstWord.contains(letter) && !secondWord.contains(letter) && !thirdWord.contains(letter)) {
//            System.out.println(firstWord);
//            return;
//        } else if (!firstWord.contains(letter) && secondWord.contains(letter) && !thirdWord.contains(letter)) {
//            System.out.println(secondWord);
//            return;
//        } else if (!firstWord.contains(letter) && !secondWord.contains(letter) && thirdWord.contains(letter)) {
//            System.out.println(thirdWord);
//            return;
//        }
//        if (firstWord.contains(letter) && secondWord.contains(letter)) {
//            if (firstWord.length() > secondWord.length()) {
//                System.out.println(firstWord);
//            } else {
//                System.out.println(secondWord);
//            }
//            return;
//        }
//        if (firstWord.contains(letter) && thirdWord.contains(letter)) {
//            if (firstWord.length() > thirdWord.length()) {
//                System.out.println(firstWord);
//            } else {
//                System.out.println(thirdWord);
//            }
//            return;
//        }
//        if (thirdWord.contains(letter) && secondWord.contains(letter)) {
//            if (thirdWord.length() > secondWord.length()) {
//                System.out.println(thirdWord);
//            } else {
//                System.out.println(secondWord);
//            }
//        }
    }
}
