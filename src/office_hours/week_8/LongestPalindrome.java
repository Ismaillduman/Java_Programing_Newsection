package office_hours.week_8;

import utilities.StringUtility;

public class LongestPalindrome {
    public static String longestPalindrome(String[] words){
        String longest="";
        for (String each : words) {
            String reverse= StringUtility.reverse(each);
            if(reverse.equalsIgnoreCase(each)&&reverse.length()>longest.length()){
                longest=reverse;
            }
        }
        return longest.isEmpty() ? "No Palindrome Found": longest;
    }

    public static void main(String[] args) {
        String[] strs = {"java", "long word", "civic", "apple", "racecar", "mom", "anna", "really long word"};

        System.out.println(longestPalindrome(strs));
    }
}
