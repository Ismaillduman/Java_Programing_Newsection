package day_28_encapsulation.encapsulation;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class TestPerson {


    public static void main(String[] args) {
        Person person= new Person("john",25,'M', LocalDate.of(2000,12,5));
        System.out.println(person);
    }
}
