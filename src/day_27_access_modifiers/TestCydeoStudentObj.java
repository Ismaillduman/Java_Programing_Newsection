package day_27_access_modifiers;

import org.w3c.dom.ls.LSOutput;

public class TestCydeoStudentObj {


    public static void main(String[] args) {
        CydeoStudent student1= new CydeoStudent("ismail",39,'M');
        CydeoStudent student2= new CydeoStudent("Harry",15,'M');
        CydeoStudent student3= new CydeoStudent("Karen",25,'F');

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        //System.out.println(student1.schoolName); not recommended
        System.out.println(CydeoStudent.schoolName);
        System.out.println(CydeoStudent.secretCode);
    }
}
