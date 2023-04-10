package practiseTasks.day_27;

public class Person {
    /*Create a class named Person:
            Variables:
                name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            Methods:
                printPlanetName()
                eat(String food)
                drink(String drink)
                toString()*/
    public String name, language;
    public int age;
    public char gender;

    public static String planet;
    public static boolean isHuman;
    public static boolean hasNose;
    public static int numberOfWings;
    public static int numberOfHead;

    static {
        planet = "world";
        isHuman = true;
        hasNose = true;
        numberOfHead = 1;
        numberOfWings = 0;
    }

    public Person(String name, String language, int age, char gender) {
        this.name = name;
        this.language = language;
        this.age = age;
        this.gender = gender;
    }

    /* printPlanetName()
                eat(String food)
                drink(String drink)
                toString()*/
    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }
    public  void drink(String drinking){
        System.out.println(name+" is drinking "+drinking);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                ", gender=" + gender +" "+name+
                ", is HUman=" + isHuman +
                ", living=" + planet +
                ", has nose=" + hasNose +
                ", number Of Head=" + numberOfHead +
                '}';
    }

    public static void main(String[] args) {
        Person person= new Person("Maria","English",56,'F');
        System.out.println(person);
        person.drink("water");
        person.eat("Hamburger");

    }
}
