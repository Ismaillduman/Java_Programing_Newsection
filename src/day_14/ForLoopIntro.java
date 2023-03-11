package day_14;

import java.util.Arrays;

public class ForLoopIntro {
    public static void main(String[] args) {
        String word="Java";


        String[] word_1={"Java","Python","Typescript","c++"};

        for(int i=0;i<word.length();i++){
            System.out.println(word.charAt(i));
        }
        for(int i=0;i< word_1.length;i++){
            System.out.print(Arrays.toString(word_1[i].toCharArray()));
        }


        for(int i=0;i>=10;i--){
            System.out.println("hello cydeo");
        }

        for(int i=10;i>=5;i--){
            System.out.println("hello");
        }
    }
}
