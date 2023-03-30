package office_hours.week_8;

import java.util.Arrays;

public class BeginningEnd {
    public static void main(String[] args) {
        String[] names = {"Anna", "Mike", "Aliya", "Remus", "Gina", "Hannah", "Nathan", "Otto", "Kevin", "Kelly"};
        int count = 0;
        String beginningEnd = "";

        for (String each : names) {
            for (int i = 0; i < each.length(); i++) {
                if (each.toLowerCase().charAt(0) == each.charAt(each.length() - 1)) {
                    beginningEnd += each + "<>";
                    count++;


                    break;
                }

            }


        }
        String[] newArr = beginningEnd.split("<>");
        System.out.println(Arrays.toString(newArr));
        System.out.println("\n");
        System.out.println(count);

        String same="";
        int sameCount=0;
        for (String each : names) {
            if(each.endsWith(each.substring(0,1).toLowerCase())){
                same+=each+"<>";
                sameCount++;
            }
        }
        String[] sames= same.split("<>");
        System.out.println("sameCount = " + sameCount);
        System.out.println("sames = " + Arrays.toString(sames));
    }
}
