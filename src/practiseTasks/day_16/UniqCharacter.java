package practiseTasks.day_16;

import java.util.Scanner;

public class UniqCharacter {
    public static void main(String[] args) {

//        Scanner sc= new Scanner(System.in);
//        String str= sc.nextLine();
//        String uniq="";
//
//        for (int i = 0; i <str.length() ; i++) {
//            char ch= str.charAt(i);
//            if(str.indexOf(ch)==str.lastIndexOf(ch)){
//                uniq+=""+ch;
//            }
//        }
//        System.out.println("uniq = " + uniq);
        String word="asdkslanvfpöa";
        String uniq="";


        for (int j = 0; j < word.length(); j++) {
            int frequency=0;
            char ch= word.charAt(j);
            for (int i = 0; i <word.length() ; i++) {

                if(word.charAt(i)==ch){
                    frequency++;
                }
            }
            if(frequency==1){
                uniq+=""+ch;
            }
        }

        System.out.println("uniq = " + uniq);



    }
}
