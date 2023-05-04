package daily_lessons.day_35_Polymorphism;
import daily_lessons.day_34_abstraction_continue.animal.*;

public class PolyMorphismIntro {
    public static void main(String[] args) {
        Dog dog= new Dog("max","Grey","Medium","Husky",5,'M');
        Cat cat= null;
        Dolphin dolphin=null;
        Duck duck=null;
        Eagle eagle=null;
        Lion lion=null;
        Parrot parrot=null;
        Shark shark=null;
        Tiger tiger=null;

        Animal[] animals={dog,cat,dolphin,duck,eagle,lion,parrot,shark,tiger};
        Animal animal1= new Dog("max","Grey","Medium","Husky",5,'M');
        Dog dog2= new Dog("max","Grey","Medium","Husky",5,'M');
        //animal1.bark(); not able to while Animal class have not the bark method
        dog2.bark(); //but Dog class has bark method

    }
}
