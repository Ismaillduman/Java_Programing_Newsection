package day_06;

public class CharacterIdentity {
    public static void main(String[] args) {

   char ch= '!';
       boolean isDigit=  ch<='9'&& ch>='0';
       boolean isAlphabetic= ch<='Z' && 'A'<=ch || ch<='z' && 'a'<=ch ;
       //boolean isSpecialChar= !isAlphabetic && !isNumber;
       String result = "";

       if(isAlphabetic){
           result= "Alphabetic";
       } else if (isDigit) {
           result= "Digit";
       }else{
           result="Special Character";
       }
        System.out.println(ch+ " "+result);
    }
}
