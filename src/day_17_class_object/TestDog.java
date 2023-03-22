package day_17_class_object;

public class TestDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog("MAX",'M',2,"grey","ShortHair","Middle");
        dog1.setName("Maxy");
        System.out.println("dog1.getName() = " + dog1.getName());
        dog1.setInfo("MAXBOB",'M',3,"black","husky","Large");

//        dog1.gender = 'M';
//        dog1.age = 2;
//        dog1.breed = "Husky";
//        dog1.color = "yellow";
//        dog1.size = "large";
//       // dog1.name = "Duman";
        dog1.eat();
        System.out.println(dog1);

        Dog dog2= new Dog("JOSH",'M',5,"brown","ShortHair","Large");
        dog2.name="damla";
        dog2.setSize("M");
        dog2.gender='M';
        dog2.age=2;
        dog2.setBreed("British short hair");
        dog2.setColor("grey");

        Dog dog3= new Dog("Lesiy",'M',5,"yellow","golden","large");
        dog3.setInfo("KARABAS",'F',3,"Black","Türkish", "middle");


        System.out.println("dog1 = " + dog1);
        System.out.println("dog2 = " + dog2);
        System.out.println("dog3 = " + dog3);
        dog3.eat();
    }
}
