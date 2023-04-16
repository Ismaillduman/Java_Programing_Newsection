package daily_lessons.day_25;

import java.time.LocalDate;

public class Person {
    public  String name;
    public int age;
    public char gender;
    public boolean isMarried,isEmployed;
    public LocalDate dateOfBirthday;

    public Person(String name, int age, char gender, boolean isMarried, boolean isEmployed, LocalDate dateOfBirthday) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
        this.dateOfBirthday = dateOfBirthday;
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                ", dateOfBirthday=" + dateOfBirthday +
                '}';
    }
    public  void eat(String food){

        System.out.println( name+" eating "+food);

    }
    public  void drink(String drink){

        System.out.println( name+" drinking "+drink);

    }
    public  void sleeping(){

        System.out.println( name+" sleep.");

    }
}
