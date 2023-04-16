package day_29_inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog= new Dog();

        dog.setInfo("lesie","husky","brown","medium",'M',3);
        dog.eat();
        dog.bark();
        System.out.println(dog);
        System.out.println("-----------------------------");
        Cat cat= new Cat();
        cat.setInfo("Damla","British Short Hair","grey","medium",'F',2);
        cat.meow();
        System.out.println(cat);
        System.out.println("--------------------------------------");
        Tiger tiger= new Tiger();
        tiger.setInfo("Woody","Bengal","yellow","Large",'M',5);
        System.out.println(tiger);
        tiger.hunt();
        tiger.drink();

        cat.setName("yumak");
        System.out.println(cat);
        System.out.println(cat.getName());
    }

}
