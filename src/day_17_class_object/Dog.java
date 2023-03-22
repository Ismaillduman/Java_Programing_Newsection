package day_17_class_object;

public class Dog {
    String name;
  private String breed, size, color;
    public char gender;
    public int age;

public   Dog( String name, char gender, int age, String color, String breed, String size ){
    this.name = name;//this keyword call to me instance variable
    this.color=color;
    this.age= age;
    this.breed= breed;
    this.size=size;
    this.gender=gender;
}
    public   void setInfo( String name, char gender, int age, String color, String breed, String size ){
        this.name = name;//this keyword call to me instance variable
        this.color=color;
        this.age= age;
        this.breed= breed;
        this.size=size;
        this.gender=gender;
    }



    public void eat() {
        System.out.println(name + " is eating");
    }

    public void drink() {
        System.out.println(name + " is drinking");
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public String toString() {//to avoid getting hash-codes when we want to print the object
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }


}
