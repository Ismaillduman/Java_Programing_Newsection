package day_21_multi_dimensional_array;

import java.util.Arrays;

public class RemoveSpace {

    public static void main(String[] args) {
        String str= "  Hello World     I   love    java    ";

        str=str.trim();

//        str = str.trim().replace(" ","");
//        System.out.println(str);

        String [] split= str.split(" ");

        str="";

        for (String s : split) {
            if(!s.equals("")){
              str+= s+" ";

            }

        }

        System.out.println(str.trim());


    }
}
