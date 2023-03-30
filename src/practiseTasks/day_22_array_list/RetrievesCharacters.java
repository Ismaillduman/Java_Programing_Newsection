package practiseTasks.day_22_array_list;

public class RetrievesCharacters {
    public static void main(String[] args) {
        /*Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= "WoodenSpoon";
            Digits = "";
            specialChars = " !";
        * */

        String str= "Wooden Spoon!";
        String special="";
        String letter="";
        String digit="";

        for (char ch:str.toCharArray()) {

            if(Character.isDigit(ch)){
             digit+=""+ch;
            }

            if(Character.isLetter(ch)){
               letter+= ""+ch;

            }

            if(!Character.isLetterOrDigit(ch)){
               special+=""+ch;

            }
        }
        System.out.println("special = " + special);
        System.out.println("letter = " + letter);
        System.out.println("digit = " + digit);
    }
}
