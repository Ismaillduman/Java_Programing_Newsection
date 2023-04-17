package daily_lessons.day_29_inheritance.encapsulation;

public class Test {
    public static void main(String[] args) {
        Student student1= new Student("Adam","Harvard",19,'M','B');
        Student student2= new Student("Carol","Oxford",26,'F','A');

        System.out.println(student1);

        student1.study();
        student1.setAge(23);
        student1.setName("Max");
        System.out.println(student1);


        System.out.println(student2);
        student2.setSchoolName("MIT");
        student2.study();

    }
}
