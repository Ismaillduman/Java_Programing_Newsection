package office_hours.week_11.foodCourse;

public class FoodCourse {
    private String name;
    private double price;

    public FoodCourse(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    /*Create a class FoodCourse
    define these instance variables:
        name, price

    Create a class Entree
    inherit the FoodCourse class
    add an instance variable

    Create a class Taco
    inherits the Entree class

    Create a class Fish
    inherits the Entree class
    create an additional instance variable: fish type

    Create a class Restaurant class to test all of the objects
        check the variables that are accessed from each object

-> For more practice continue to add more courses and specific meals classes
    entrees: gyro, steak, pasta
    appetizers (sub of FoodCourse): breadstick, cheese stick, shrimp
    deserts (sub of FoodCourse): ice cream, cookies, cake*/
}
