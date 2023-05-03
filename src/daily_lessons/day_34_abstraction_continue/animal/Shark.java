package daily_lessons.day_34_abstraction_continue.animal;

public class Shark extends Animal implements WildAnimal,Swimmable{

    public Shark(String name, String color, String size, String breed, int age, char gender) {
        super(name, color, size, breed, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(getClass().getSimpleName()+" "+getName()+" is eating fish");
    }

    @Override
    public void swim() {

    }

    @Override
    public void hunt() {

    }
}
