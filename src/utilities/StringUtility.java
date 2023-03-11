package utilities;

public class StringUtility {

    public static String reverse(String word){
        String result="";
        for(int i=word.length()-1;i>=0;i--){

            result+= word.charAt(i);
        }
        return result;
    }
}
