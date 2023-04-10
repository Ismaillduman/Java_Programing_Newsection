package day_27_access_modifiers;

public class TestNestedClassObjCar {

    public static void main(String[] args) {
        Car obj1= new Car(); //car object

        Car.CarEngine obj2= obj1.new CarEngine();//carEngine object

Car.StaticInnerClass obj3= new Car.StaticInnerClass();

/*eger static bir inner classtan obje create etmek istersem outer class ile call ederim
* eger non-static bir inner classtan obje create etmek istersem once outer classtan bir object create edrim ve
*  sonra bu object inner class'i call ederim*/



    }
}
