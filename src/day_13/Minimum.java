package day_13;

public class Minimum {
    public static void main(String[] args) {
        System.out.println(minNum(96, 58));
        System.out.println(maxNum(56, 10));


    }

    public static int minNum(int a, int b){
        return a>b? b:a;
    }
    public static int maxNum(int a, int b){
        return a>b? a:b;
    }
}
