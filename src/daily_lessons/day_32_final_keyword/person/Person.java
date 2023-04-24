package daily_lessons.day_32_final_keyword.person;

import java.time.LocalDate;

public class Person {
    private String name;
    private final int age;
    private final char gender;
    private final LocalDate dateOfBirth;
    public static final int numberOfHead;

    static {
        numberOfHead = 2;
    }

    public Person(String name, int age, char gender, LocalDate dateOfBirth) {
        this.name = name;

        if (!(gender == 'M' || gender == 'F')) {
            System.err.println("invalid gender");
            System.exit(1);
        }
        if (age <= 0) {
            System.err.println("invalid age");
            System.exit(1);
        }
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    public void setGender(char gender) {
//        this.gender = gender;
//   final variable can not set  }


    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }


    public void eat() {
        System.out.println(name + " is eating");
    }

    public void drink() {
        System.out.println(name + " is drinking");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public final void breath() {
        System.out.println(name + " is breathing");
    }
}
