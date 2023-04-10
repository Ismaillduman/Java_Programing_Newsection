package day_27_access_modifiers;

public class TestNestedClassObjCar {

    public static void main(String[] args) {
        Car obj1= new Car(); //car object
        obj1.new CarEngine();//carEngine object

Car.StaticInnerClass obj2= new Car.StaticInnerClass();
obj2.method();

    }
}
