package daily_lessons.day_34_abstraction_continue.animal;

public class Dog extends Animal{
    public Dog(String name, String color, String size, String breed, int age, char gender) {
        super(name, color, size, breed, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(getClass().getSimpleName()+" "+getName()+" is eating dog food");
    }

    public void bark(){
        System.out.println(getName()+" is barking");
    }
}
