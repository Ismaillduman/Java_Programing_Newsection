package practiseTasks.day_21;

import java.util.Arrays;

public class CydeoStudents {
    public static void main(String[] args) {
        String[] batch1Group1 = {"Ahmet", "Baturay", "Beyza", "Dilara", "Muhtar"};
        String[] batch1Group2 = {"Entisar", "Ermek", "Esmira", "Gadir", "Hrvoje", "Igor", "Muhtar"};
        String[] batch1Group3 = {"Kramer", "Lorraine", "Lucy", "Madina", "Yasin", "Muhtar"};

        String[][] batchOneGroups= new String[3][];

       //batchOneGroups= {batch1Group1, batch1Group2, batch1Group3};

        batchOneGroups[0]=batch1Group1;
        batchOneGroups[1]=batch1Group2;
        batchOneGroups[2]=batch1Group3;

        System.out.println(Arrays.deepToString(batchOneGroups));

        System.out.println("----------------------------------------------------");

        String[] batch2Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch2Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch2Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String[][] batch2Groups= new String[3][];

        batch2Groups[0]=batch2Group1;
        batch2Groups[1]=batch2Group2;
        batch2Groups[2]=batch2Group3;

        String[][][] cydeoStudents= new String[2][][];
        cydeoStudents[0]=batchOneGroups;
        cydeoStudents[1]=batch2Groups;

        for (String[][] batchGroups : cydeoStudents) {
            //System.out.println(Arrays.deepToString(batchGroups));
            for (String[] groups : batchGroups) {
                for (String eachStudents : groups) {
                    System.out.println(eachStudents);
                }
            }
        }




    }
}
