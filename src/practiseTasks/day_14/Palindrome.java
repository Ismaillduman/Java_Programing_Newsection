package practiseTasks.day_14;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("level"));
    }
    public static boolean palindrome(String word){
        String result_0=" ";
        for(int i=word.length()-1;i>=0;i--){

            result_0+=word.charAt(i);
            if(word.equalsIgnoreCase(result_0)){
                return true;
            }
        }
        return false;
    }
}
