package daily_lessons.day_31.animal;

public class Animal {
    private String name,color,size,breed;
    private int age;
    private char gender;


    public Animal(String name, String color, String size, String breed, int age, char gender) {

        this.name=name;
        setColor(color);
        setSize(size);
        setBreed(breed);
        setAge(age);
        setGender(gender);
    }

    public Animal(){
        setName(getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void eat(){
        System.out.println(getClass().getSimpleName()+" "+getName()+" is eating food");
    }
    public void drink(){
        System.out.println(getName()+" is drinking water");
    }

    public  void sleep(){
        System.out.println(getName()+" is sleeping 8 hours");
    }
    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
