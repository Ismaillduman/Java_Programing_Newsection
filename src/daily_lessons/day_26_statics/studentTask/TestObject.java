package daily_lessons.day_26_statics.studentTask;

import java.util.Arrays;

public class TestObject {
    public static void main(String[] args) {
        Student student1 = new Student("Ismail", "12345asd", 39, 'M');
        Student student2 = new Student("Busra", "123d", 10, 'F');
        Student student3 = new Student("Yusuf", "2sd", 8, 'M');
        Student student4 = new Student("Zübeyde", "14asd", 41, 'F');
        Student student5 = new Student("Damla", "345as", 3, 'F');
        Student[] students = {student1, student5, student2, student4, student3};
        StudentsGroup studentsGroup1 = new StudentsGroup("Duman", 123);
        studentsGroup1.addStudent(students);
        studentsGroup1.addStudent("Ibrahim", "3asd", 8, 'M');
        System.out.println(studentsGroup1);
        studentsGroup1.removeStudent("123d");

        System.out.println(studentsGroup1);

        for (Student each : studentsGroup1.students) {
            System.out.println(each.name+" : "+each.id);
        }

        System.out.println("----------------------------------\n");
        StudentsGroup studentsGroup2= new StudentsGroup("SDET",1234);
        StudentsGroup studentsGroup3= new StudentsGroup("SDET",12345);
        StudentsGroup studentsGroup4= new StudentsGroup("SDET",123456);

        StudentsGroup[] groups= {studentsGroup1,studentsGroup2,studentsGroup3,studentsGroup4};



        System.out.println(Arrays.toString(groups));


    }
}
