package daily_lessons.day_29_inheritance.animalTask;

public class Dog extends Animal{

    public  void  method(){
        System.out.println(getName());
        eat();
    }
    public  void  bark(){
        System.out.println(getName()+" is barking");
    }

}
