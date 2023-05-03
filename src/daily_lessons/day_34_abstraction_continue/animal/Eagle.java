package daily_lessons.day_34_abstraction_continue.animal;

public class Eagle extends Animal implements Flyable,WildAnimal{
    public Eagle(String name, String color, String size, String breed, int age, char gender) {
        super(name, color, size, breed, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(getClass().getSimpleName()+" "+getName()+" is eating fish and mouse");
    }

    @Override
    public void fly() {

    }

    @Override
    public void hunt() {

    }
}
