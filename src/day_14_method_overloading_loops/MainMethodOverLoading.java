package day_14_method_overloading_loops;

public class MainMethodOverLoading {
    public static void main(String[] args) {
        System.out.println("A");
       main(25);

    }
    public static void main(int args) {
        System.out.println("c");


    }
    public static void main(double args) {
        System.out.println("B");
    }
    public static void main(boolean args) {
        System.out.println("D");
    }
}
