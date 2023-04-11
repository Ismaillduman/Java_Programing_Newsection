package practiseTasks.day_27;

import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObj {
    public static void main(String[] args) {
        Person person1 = new Person("Maria", "English", 56, 'F');
        Person person2 = new Person("Marty");
        Person person3= new Person("Carl",56);
        Person person4= new Person("Betty","German",'F');
        Person person5= new Person("Carl","Turkish",45,'M');
        Person person6= new Person("Carl",'M');

        Person[] arr= {person1,person2,person3,person4,person5,person6};
        ArrayList<Person> personArrayList = new ArrayList<>(Arrays.asList(arr));

        System.out.println(personArrayList);
        System.out.println(arr[1]);
        System.out.println(person1);
        person1.drink("water");
        person6.eat("Hamburger");
        Person.printPlanetName();

    }
}
