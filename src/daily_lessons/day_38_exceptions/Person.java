package daily_lessons.day_38_exceptions;

public class Person {
    private String name;
    private int age;
    private final char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        if(!(gender=='M'||gender=='F')){
            throw new RuntimeException("Invalid gender: "+gender);
        }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        if(age==0){
            throw new RuntimeException("Age has not been set");
        }
        return age;
    }

    public char getGender() {

        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age<0||age>150){
            throw new RuntimeException("Invalid age: "+age);
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
