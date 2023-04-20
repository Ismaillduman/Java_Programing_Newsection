package daily_lessons.day_31.animal;

public class Eagle extends Animal{
    public Eagle(String name, String color, String size, String breed, int age, char gender) {
        super(name, color, size, breed, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("Eagle "+getName()+ " is eating snake");
    }
}
