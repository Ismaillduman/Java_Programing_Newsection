package daily_lessons.day_24_arrayList_continue;

import java.time.LocalDate;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate birthDate;

    public void setInfo(String name,  char gender, LocalDate birthDate) {
        this.name = name;
        age = LocalDate.now().getYear() - birthDate.getYear();
        this.gender = gender;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                '}';
    }


}
