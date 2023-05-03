package daily_lessons.day_34_abstraction_continue.animal;

public class Duck extends Animal implements Flyable,Swimmable{

    public Duck(String name, String color, String size, String breed, int age, char gender) {
        super(name, color, size, breed, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(getClass().getSimpleName()+" "+getName()+" is eating worm");
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
