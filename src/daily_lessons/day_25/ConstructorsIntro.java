package daily_lessons.day_25;

public class ConstructorsIntro {

    public ConstructorsIntro(){
        //constructor special method
        System.out.println("object created by using no argument constructor");
    }
    public ConstructorsIntro(int a){
        //constructor special method
        System.out.println("object created by using int argument");
    }

    public static void method(){
        //regular method
    }
    public  void add(){
        //instance method
    }

    public static void main(String[] args) {
        ConstructorsIntro obj= new ConstructorsIntro(5);

        ConstructorsIntro obj1= new ConstructorsIntro();
    }

}
