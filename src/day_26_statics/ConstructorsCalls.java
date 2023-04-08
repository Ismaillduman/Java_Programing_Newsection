package day_26_statics;

public class ConstructorsCalls {
/*
* constructor can not be called by its name this(); need to be used
* only a constructor can call another constructor
* this. : to call instance variable or methods
* this() : used for calling constructor to another constructor
* and constructor  can not call and contain itself*/
    public ConstructorsCalls(){
        //this(); constructor can not call itself
        System.out.println("constructor no argument");
    }
    public ConstructorsCalls(int a){
        this();
        System.out.println("constructor with int argument");
       // this(); constructor call has to be first step
    }
    public ConstructorsCalls(double d){
        System.out.println("constructor with double argument");
    }
    public ConstructorsCalls(String d){
        this(2.5);
        //this(); only one constructor can be able to call in a one constructor

        System.out.println("constructor with String argument");
    }
    public static void main(String[] args) {
        method2();
    }
    public static void method1(){
        System.out.println("method 1");
    }
    public static void method2(){
        method1();
        System.out.println("method 2");
    }
}
