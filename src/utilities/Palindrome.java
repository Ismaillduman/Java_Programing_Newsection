package utilities;

public class Palindrome {
    public static boolean palindrome(String word){
        String result="";
        for(int i=word.length()-1;i>=0;i--){

            result+=word.charAt(i);
            if(word.equalsIgnoreCase(result)){
                return true;
            }
        }
        return false;
    }
}
