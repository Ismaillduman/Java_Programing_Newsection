package daily_lessons.day_34_abstraction_continue.animal;

public class Parrot extends Animal implements Flyable,Playable{
    public Parrot(String name, String color, String size, String breed, int age, char gender) {
        super(name, color, size, breed, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(getClass().getSimpleName()+" "+getName()+" is eating bait");
    }

    @Override
    public void fly() {

    }

    @Override
    public void play() {

    }
}
