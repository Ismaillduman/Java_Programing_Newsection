package daily_lessons.day_31.animal;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat= new Cat("Damla","Grey","small","British short hair",3,'F');
        Lion lion= new Lion("Leon","Yellow","Large","African",5,'M',true);
        Eagle eagle= new Eagle("Kartal","Black and white","Medium","Mountain Rock Eagle",6,'M');
        Dog dog = new Dog("Angel", "Yellow","Medium","Husky",4,'F');

        System.out.println(dog);
        System.out.println(lion);
        System.out.println(cat);
        System.out.println(eagle);
        System.out.println("-------------------------------------");
        cat.eat();
        dog.eat();
        lion.eat();
        eagle.eat();
        System.out.println("----------------------------------------");
        cat.sleep();
        dog.sleep();
        lion.sleep();
        eagle.sleep();
    }
}
