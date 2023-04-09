package day_26_statics;

public class TestIphoneObj {
    public static void main(String[] args) {
        Iphone.printOperatingSystem();// static method i can call directly with class name.
        // statics belongs the class, not depend on the objects

        Iphone iphone = new Iphone("iPhone 13", "black", 850);
        //every single object come from a class. instances are the object members

        System.out.println(iphone.color);
        System.out.println(iphone.model);
        System.out.println(iphone.price);

        iphone.printIphoneInfo(); //instance method i can call after creating a object

        // System.out.println(iphone.madeIn);//Static member  accessed via instance reference. that's not recommended

        System.out.println(Iphone.madeIn);//static members call truth the class name

        //instance method accept static and instance variable
        //static method accept only static variable
    }
}
