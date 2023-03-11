package practiseTasks.day_14;

public class Retrive {
    public static void main(String[] args) {
        /*write a program that can retrive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!*/
        String word = "mn@#123Ab!";
        String digit= "";
        String special = "";
        String letters = "";

        for (int i = 0; i < word.length(); i++) {
           char ch = word.charAt(i);
            if (ch>='0'&&ch<='9') {
                digit+=ch;

            }else if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'){
                letters+=ch;
            }else{
                special+=ch;
            }

        }
        System.out.println(digit);
        System.out.println(letters);
        System.out.println(special);
    }
}
