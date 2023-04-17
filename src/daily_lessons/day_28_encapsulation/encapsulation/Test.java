package daily_lessons.day_28_encapsulation.encapsulation;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName());
        student.setName("Ismail");
        System.out.println(student.getName());
        student.setAge(100);
        System.out.println(student.getAge());
        System.out.println("try print after if not the terminate with System.exit();");
        student.setName("is2ail");

    }
}
