package daily_lessons.day_34_abstraction_continue.animal;

public class Cat extends Animal implements Playable{
    public Cat(String name, String color, String size, String breed, int age, char gender) {
        super(name, color, size, breed, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(getClass().getSimpleName()+" "+getName()+" is eating cat food");
    }

    @Override
    public void play() {

    }
}
