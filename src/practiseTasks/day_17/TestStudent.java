package practiseTasks.day_17;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setInfo("Busra","Female",10,12546,'A',true);
        System.out.println(student);

        Student student_1 = new Student();
        student_1.name="Yusuf";
        student_1.gender="Male";
        student_1.age=7;
        student_1.studentId=145789;
        student_1.grade='A';
        student_1.isFullTime=false;
        System.out.println(student_1);

        student_1.study();


    }
}
