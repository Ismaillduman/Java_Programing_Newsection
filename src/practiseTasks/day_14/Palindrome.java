package practiseTasks.day_14;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome("racecar"));
        System.out.println(palindrome("kalkak"));
    }
    public static boolean palindrome(String word){
        String result_0="";
        for(int i=word.length()-1;i>=0;i--){

            result_0+=word.charAt(i);
            if((word.equalsIgnoreCase(result_0))){
                return true;
            }
        }
        return false;
    }

    public static boolean isPalindrome(String str){ //another way to solve

        for (int begin = 0,end=str.length()-1; begin <str.length()/2 ; begin++, end--) {
            if(str.charAt(begin)!=str.charAt(end)){
                return false;
            }
        }
        return true;
    }
}
