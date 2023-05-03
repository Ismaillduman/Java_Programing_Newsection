package daily_lessons.day_34_abstraction_continue.animal;

public class Dolphin extends Animal implements Playable,Swimmable{
    public Dolphin(String name, String color, String size, String breed, int age, char gender) {
        super(name, color, size, breed, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(getClass().getSimpleName()+" "+getName()+" is eating fish");
    }

    @Override
    public void play() {

    }

    @Override
    public void swim() {

    }
}
