package day_14_method_overloading_loops;

public class MethodOverLoading {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,80));
        System.out.println(sum(10,20,80,5));
    }



    public static int sum(int a,int b){
        return a-b;
    }
    public  static  int sum(int a, int b, int c){
        return sum(a,b)+c;
    }

    public  static  int sum(int a, int b, int c,int d){
        return sum(a,b,d)-c;
    }

    public static double sum(double a,double b){
        return a-b;
    }
    public  static  double sum(double a, double b, double c){
        return sum(a,b)+c;
    }

    public  static  double sum(double a, double b, double c, double d){
        return sum(a,b,d)+c;
    }
/*
* different parameter number or different value type muss i use to method overloading*/

}
