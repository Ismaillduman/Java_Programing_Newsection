package day_24_arrayList_continue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestPersonObj {
    public static void main(String[] args) {
        Person[] people = {new Person(), new Person(), new Person(), new Person(), new Person()};

        people[0].setInfo("Ismail", 'M', LocalDate.of(1983, 2, 5));
        people[1].setInfo("Busra", 'F', LocalDate.of(2012, 11, 25));
        people[2].setInfo("Zübeyde", 'F', LocalDate.of(1981, 3, 17));
        people[3].setInfo("Yusuf", 'M', LocalDate.of(2015, 5, 12));
        people[4].setInfo("Damla", 'F', LocalDate.of(2021, 9, 20));

        ArrayList<Person> person = new ArrayList<>();
        person.addAll(Arrays.asList(people));
        System.out.println(person);
        //print name &date of birth of each person object
        for (Person eachPerson : person) {
            if (eachPerson.age < 36) {
                System.out.println(eachPerson.name + ": " + eachPerson.birthDate);
            }
        }
        //remove all the person object
        person.removeIf(p -> p.age > 30);
        System.out.println(person);
    }
}
