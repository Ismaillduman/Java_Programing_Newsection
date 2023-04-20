package daily_lessons.day_31;
 class A {
    public int a=10;

}

public class Field extends A{

    public int a=100;

    public static void main(String[] args) {
        System.out.println(new Field().a);
    }
}


