package practiseTasks.day_19;

import java.util.Arrays;

public class ReverseClassmates {
    public static void main(String[] args) {
        /*create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c*/

        String[] classmates = new String[10];
        classmates[0] = "Ismail";
        classmates[1] = "Busra";
        classmates[2] = "Yusuf";
        classmates[3] = "Zübeyde";
        classmates[4] = "Damla";
        classmates[5] = "Azim";
        classmates[6] = "Ahmet";
        classmates[7] = "Emine";
        classmates[8] = "Sündüz";
        classmates[9] = "Ömer";
        String[] reverse = new String[10];
        for (int i = 0, j = 9; i < classmates.length; i++, j--) {
            reverse[j] = classmates[i];
        }

        System.out.println(Arrays.toString(reverse));

    }
}
