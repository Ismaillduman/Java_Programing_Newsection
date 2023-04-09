package day_26_statics;

public class Iphone {
    /*Since static variables belong to a class, we can access them directly using the class name.
     So, we don't need any object reference.

We can only declare static variables at the class level.

We can access static fields without object initialization.

Finally, we can access static fields using an object reference (such as ford.numberOfCars++).
But we should avoid this because it becomes difficult to figure out if it’s an instance variable or a class variable.
 Instead, we should always refer to static variables using the class name (Car.numberOfCars++).*/
    public String model, color;
    public static String brand = "Apple";
    public static String os = "iOS";
    public static String madeIn = "China";
    public double price;
    public static boolean hasBattery= true;
    public static  boolean isTouchScreen= true;
    public static boolean isExpensiveToFix=true;


    public Iphone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

//   public static void printPhoneInfo(){//static only accept static
//       System.out.println(madeIn);
//   }
    public void printIphoneInfo(){
        System.out.println("brand = " + brand);
        System.out.println("color = " + color);
        System.out.println("model = " + model);
        System.out.println("price = " + price);
        //instance methods can share both object and class members
        // static method share only class members. accept only class members
        //method can be only when the all  the members are static
    }
    public  static  void printOperatingSystem(){
        System.out.println("os = " + os);
        //if the method is static , it's not need the object. that's the benefit of static method.
        // so that we can call just the with class name
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", OS=" + os +
                ", price=" + price +
                ", made in: " + madeIn +
                ", has battery: " + hasBattery +
                ", is expensive to fix: " + isExpensiveToFix +
                ", is touch screen: " + isTouchScreen +
                '}';
    }


}
