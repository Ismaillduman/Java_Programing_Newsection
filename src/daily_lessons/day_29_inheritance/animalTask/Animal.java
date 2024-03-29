package daily_lessons.day_29_inheritance.animalTask;

public class Animal {
    private String name,breed,color,size;
    private char gender;
    private int age;
    public  static boolean isAnimal;
    static {
        isAnimal=true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setInfo(String name, String breed, String color, String size, char gender, int age) {
    setName(name); //when ich möchte die Bedingung stellen change this.bane=name; to setName(name)
    setBreed(breed);
    setColor(color);
    setSize(size);
    setGender(gender);
    setAge(age);

    }
    
    public void eat(){
        System.out.println(name+" is eating");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    public void drink(){
        System.out.println(name+" is drinking");
    }


    public String toString() {
        return getClass().getSimpleName() +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
