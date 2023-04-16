package day_29_inheritance.animalTask;

import javax.crypto.spec.PSource;

public class Dog extends Animal{

    public  void  method(){
        System.out.println(name);
        eat();
    }
    public  void  bark(){
        System.out.println(name+" is barking");
    }

}
