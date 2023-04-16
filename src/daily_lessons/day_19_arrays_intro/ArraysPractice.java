package daily_lessons.day_19_arrays_intro;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        String [] myFamily=new String[5];
        myFamily[0]="Ismail";
        myFamily[1]="Zübeyde";
        myFamily[2]="Busra";
        myFamily[myFamily.length-1]="Damla";
        myFamily[myFamily.length-2]="Yusuf";

        System.out.println(Arrays.toString(myFamily));  //[Ismail, Zübeyde, Busra, Yusuf, Damla]
        myFamily[myFamily.length-2]="Ibrahim"; //update
        System.out.println(Arrays.toString(myFamily)); //[Ismail, Zübeyde, Busra, Ibrahim, Damla]

        //length-1= size of index


        System.out.println("--------------------------------------------------------");


        for (int i = myFamily.length-1; i >=0; i--) {
            System.out.println(myFamily[i]);
        }
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < myFamily.length; i++) { //myFamily.fori

        }


        for (int i = myFamily.length - 1; i >= 0; i--) { //myFamily.forr reverse

        }
        
    }

}
