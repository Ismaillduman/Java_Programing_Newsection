package day_06;

public class CharacterIdentity {
    public static void main(String[] args) {

   char ch= '@';
       boolean isNumber=  ch<='9'&& ch>='0';
       boolean isAlphabetic= ch<='Z' && 'A'<=ch || ch<='z' && 'a'<=ch ;
       //boolean isSpecialChar= !isAlphabetic && !isNumber;
       String result = "";

       if(isAlphabetic){
           result= "Alphabetic";
       } else if (isNumber) {
           result= "Digit";
       }else{
           result="Special Character";
       }
        System.out.println(ch+ " "+result);
    }
}
