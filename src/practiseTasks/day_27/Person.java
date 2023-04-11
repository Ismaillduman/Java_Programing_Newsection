package practiseTasks.day_27;

public class Person {

    public String name, language;
    public int age;
    public char gender;

    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHead;

    static {
        planet = "world";
        isHuman = true;
        hasNose = true;
        numberOfHead = 1;
        numberOfWings = 0;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public Person(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Person(String name, String language, int age) {
        this(name, age);
        this.language = language;

    }


    public Person(String name, String language, int age, char gender) {
        this(name, language, age);
        this.gender = gender;
    }

    public static void printPlanetName() {
        System.out.println("Planet is the " + planet);
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drinking) {
        System.out.println(name + " is drinking " + drinking);
    }

    public String toString() {
        return "\nPerson{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                ", gender=" + gender + " " + name +
                ", is Human=" + isHuman +
                ", living=" + planet +
                ", has nose=" + hasNose +
                ", number Of Head=" + numberOfHead +
                '}';
    }


}
