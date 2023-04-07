package day_26_statics.studentTask;

public class TestObject {
    public static void main(String[] args) {
        Student student1= new Student("Ismail","12345asd",39,'M');
        Student student2= new Student("Busra","123d",10,'F');
        Student student3= new Student("Yusuf","2sd",8,'M');
        Student student4= new Student("Zübeyde","14asd",41,'F');
        Student student5= new Student("Damla","345as",3,'F');

    StudentsGroup studentsGroup1= new StudentsGroup("Duman",123);
    StudentsGroup studentsGroup2= new StudentsGroup("Duman2",1234);
    studentsGroup1.addStudent(student1);
    studentsGroup1.addStudent(student2);
    studentsGroup1.addStudent(student3);
    studentsGroup1.addStudent(student4);
    studentsGroup1.addStudent(student5);
        System.out.println(studentsGroup1);
    }
}
