package daily_lessons.day_21_multi_dimensional_array;

import java.util.Arrays;

public class MultiDimensionalArrayPractise {


    public static void main(String[] args) {
        String[] group1 = {"ismail", "busra", "yusuf", "zubeyde"}; //4 name
        String[] group2 = {"damla", "yumak", "bulut"}; //3 name
        String[] group3 = {"bird", "cat", "dog", "mouse"}; //5 name
        String[] group4 = {"car", "airplane"}; //2 name

        String[][] groups = {group1, group2, group3, group4};

        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));
            for (String eachElement : eachGroup) {
                System.out.println(eachElement);
            }
        }

        for (int i = 0; i < groups.length; i++) {
            String []eachGroup= groups[i];
            System.out.println(Arrays.toString(eachGroup));
            for (int j = 0; j < eachGroup.length; j++) {
                String eachElement=eachGroup[j];
                System.out.println(eachElement);
            }
        }
        System.out.println("----------------reverse----------------\n");
        for (int i = groups.length - 1; i >= 0; i--) {
            String[] eachGroup=groups[i];
            System.out.println(Arrays.toString(eachGroup));
            for (int j = eachGroup.length - 1; j >= 0; j--) {
                String eachReverseElement= eachGroup[j];
                System.out.println(eachReverseElement);
            }
        }
        System.out.println(Arrays.toString(groups)); // toString method only for single dimensional array

        System.out.println(Arrays.deepToString(groups)); //deepToString for multi dimensional array

    }
}
