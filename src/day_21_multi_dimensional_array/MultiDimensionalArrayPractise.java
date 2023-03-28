package day_21_multi_dimensional_array;

import java.util.Arrays;

public class MultiDimensionalArrayPractise {


    public static void main(String[] args) {
        String[] group1={"ismail","busra","yusuf","zubeyde"}; //4 name
        String[] group2={"damla","yumak","bulut"}; //3 name
        String[] group3={"bird","cat","dog","mouse"}; //5 name
        String[] group4={"car","airplane"}; //2 name

        String [][] groups= {group1,group2,group3,group4};

        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));
            for (String eachElement : eachGroup) {
                System.out.println(eachElement);
            }
        }

    }
}
