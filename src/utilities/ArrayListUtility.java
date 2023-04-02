package utilities;

import day_22_arrayList.ArrayListIntro;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListUtility {

    public static int countCharInList(ArrayList<String> list, char letter) {
        int count = 0;
        for (String eachWord : list) {
            for (char eachletter : eachWord.toCharArray()) {
                if (eachletter == letter) {
                    count++;
                }


            }
        }
        return count;
    }
//converts primate int Array to ArrayList
    public static ArrayList<Integer> convertArrayToList(int[]arr){
    ArrayList<Integer> list= new ArrayList<>();
    for(int each:arr){
        list.add(each);
    }
    return list;
    }
    //convert arrayList to array
    public static String[] convertListToArray(ArrayList<String> list){
      String [] arr= new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i]=list.get(i);
        }
        return arr;
    }
}
