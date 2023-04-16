package day_29_inheritance.animalTask;

public class Animal {
    public String name,breed,color,size;
    public char gender;
    public int age;
    public  static boolean isAnimal;
    static {
        isAnimal=true;
    }

    public void setInfo(String name, String breed, String color, String size, char gender, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.size = size;
        this.gender = gender;
        this.age = age;
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

}
