package daily_lessons.day_31.animal;

public class Dog extends Animal {

    public Dog(String name, String color, String size, String breed, int age, char gender) {
        super(name, color, size, breed, age, gender);
    }

    public void bark(){
        System.out.println("Dog "+getName()+" is barking");
    }

    @Override
    public void eat() {
        System.out.println(getClass().getSimpleName()+" "+getName()+" is eating dog food");
    }

}
