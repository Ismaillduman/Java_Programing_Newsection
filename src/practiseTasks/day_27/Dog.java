package practiseTasks.day_27;

import javax.xml.namespace.QName;

public class Dog {
    /*Create a class called Dog
            Variables:
                breed, size, gender, age, color, numberOfLegs, numberOfEyes, numberOfWings, isFriendly

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                eat()
                drink()
                sleep()
                play()
                bark()
                toString()*/
    public String breed,size,color;
    public char gender;
    public static int numberOfLegs,numberOfWings,numberOfEyes;
    public static boolean isFriendly;
    static {
        numberOfEyes=2;
        numberOfLegs=4;
        numberOfWings=0;
        isFriendly=true;
    }

    public Dog(String breed, String size, String color, char gender) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
    }
    /* Methods:
                eat()
                drink()
                sleep()
                play()
                bark()
                toString()*/

    public void eat(String food){
        System.out.println(breed+" is eating "+ food);
    }
    public void drink(String drinking){
        System.out.println(breed+" is drinking "+ drinking);
    }
    public  void sleep(){
        System.out.println(breed+" is sleeping");
    }
    public void play(String playing){
        System.out.println(breed+" is playing with owner as "+isFriendly);
    }
    public void bark(){
        System.out.println(breed+" barking");
    }


    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", number of legs=" + numberOfLegs +
                ", number Of Wings=" + numberOfWings +
                ", number Of Eyes=" + numberOfEyes +" "+
                breed+", is Friendly=" + isFriendly +
                '}';
    }

    public static void main(String[] args) {
        Dog dog1= new Dog("Husky","Medium","Yellow",'F');
        System.out.println(dog1);
        dog1.drink("water");
        System.out.println("numberOfWings = " + numberOfWings);
        System.out.println("numberOfLegs = " + numberOfLegs);
        dog1.sleep();
    }
}
