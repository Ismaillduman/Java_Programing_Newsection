package day_25;


import day_17_class_object.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethodPractise {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

        ArrayList<Dog> smallDogs = new ArrayList<>();
        smallDogs.addAll(Arrays.asList(dogs));
        smallDogs.removeIf(p -> !p.size.equals("Small"));
        for (Dog each : smallDogs) {
            System.out.println(each.name);
        }

//        ArrayList<Dog> youngDog= new ArrayList<>();
//        for (Dog dog:dogs) {
//            if(dog.age<=4){
//                youngDog.add(dog);
//            }
//        }
        ArrayList<Dog> youngDog= new ArrayList<>(Arrays.asList(dogs));
        youngDog.removeIf(p->p.age>4);
        for (Dog each : youngDog) {
            System.out.println(each.name);
        }
        System.out.println("-----------------------------------");
ArrayList<Dog> femaleDog= new ArrayList<>(Arrays.asList(dogs));
        femaleDog.removeIf(p->p.gender=='M');
        for (Dog each : femaleDog) {
            System.out.println(each.name);
        }
        System.out.println("------------------------------");
        ArrayList<Dog> maleDog= new ArrayList<>(Arrays.asList(dogs));
        maleDog.removeIf(p->p.gender=='F');
        for (Dog each : maleDog) {
            System.out.println(each.name);
        }

        Dog[] dogs2 = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

        ArrayList<Dog> list= new ArrayList<>(Arrays.asList(dogs2));
        list.removeIf(p->p.size.equalsIgnoreCase("small"));

        dogs2= list.toArray(new Dog[list.size()]);
        System.out.println(Arrays.toString(dogs2));
    }
}
