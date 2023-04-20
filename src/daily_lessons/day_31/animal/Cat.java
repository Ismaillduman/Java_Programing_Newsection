package daily_lessons.day_31.animal;

public class Cat extends Animal{

    public Cat(String name, String color, String size, String breed, int age, char gender) {
        super(name, color, size, breed, age, gender);
    }

    public void scratch(){
        System.out.println("Cat "+getName()+" is scratching the tree");
    }

    @Override
    public void eat() {
        System.out.println(getClass().getSimpleName()+" "+getName()+ "is eating Cat foods");
    }

    @Override
    public void sleep() {
        System.out.println("Cat "+getName()+" is sleeping 12 hours daily");
    }
}
