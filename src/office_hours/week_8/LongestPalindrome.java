package office_hours.week_8;

import utilities.StringUtility;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class LongestPalindrome {
    public static String longestPalindrome(String[] words) {
        String longest = "";
        for (String each : words) {
            String reverse = StringUtility.reverse(each);
            if (reverse.equalsIgnoreCase(each) && reverse.length() > longest.length()) {
                longest = reverse;
            }
        }
        return longest.isEmpty() ? "No Palindrome Found" : longest;
    }

    public static void main(String[] args) {
        String[] strs = {"java", "long word", "civic", "apple", "racecar", "mom", "anna", "really long word"};

        System.out.println(longestPalindrome(strs));

        Scanner sc = new Scanner(System.in);
        System.out.println("How man words want to enter");
        String[] words = new String[sc.nextInt()];
        sc.nextLine();
        for (int i = 0; i < words.length; i++) {
            System.out.println("Enter word " + (i + 1));
            words[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(ReverseEach.reverseEach(words)));
        System.out.println(longestPalindrome(words));
    }
}
