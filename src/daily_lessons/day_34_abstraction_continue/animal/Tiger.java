package daily_lessons.day_34_abstraction_continue.animal;

public class Tiger extends Animal implements WildAnimal{
    public Tiger(String name, String color, String size, String breed, int age, char gender) {
        super(name, color, size, breed, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(getClass().getSimpleName()+" "+getName()+" is eating deer");
    }

    @Override
    public void hunt() {

    }
}
