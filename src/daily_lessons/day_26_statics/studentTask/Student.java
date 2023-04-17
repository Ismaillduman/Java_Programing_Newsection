package daily_lessons.day_26_statics.studentTask;

public class Student {
    public String name, id;
    public int age;
    public char gender;

    public Student(String name, String id, int age, char gender) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
    }

        public void study(){
            System.out.println(name+ " is studying");
        }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
        /*Create a custom class named Student
            Attributes:
                name, age, gender, id

            Add a constructor that can set all the fields

            Methods:
                study()
                toString()*/

}
