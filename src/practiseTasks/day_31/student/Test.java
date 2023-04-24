package practiseTasks.day_31.student;

public class Test {
    public static void main(String[] args) {
        Person person= new Person(null,56,'M');
        System.out.println(person);
        Student student= new Student("Kevin",35,'M',"1234asd","Mathematics",'A',"Oxford");
        student.eat();
        CydeoStudent cydeoStudent= new CydeoStudent("Kevin",35,'M',"1234asd","Mathematics",'A',"Oxford",29,5,"JAVA");
        cydeoStudent.drink();

    }

}
