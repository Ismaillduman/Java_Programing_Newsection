package day_22_arrayList;

public class WrapperClassIntro {
    public static void main(String[] args) {
        String str = "java";

        int a = 10;
        Integer b = 10;


        System.out.println("-----------------------------\n");

        int c1 = 100;
        Integer c2 = c1;//autoboxing primitive to wrapper: Wrapper clas accept only one variable type.

        char ch1 = 'A';
        Character ch2 = ch1;

        double db1 = 2.3;
        Double db2 = db1;
        System.out.println("------------------------------------------\n");

        Integer n1 = 10;

        int n2 = n1; // unboxing

        Character e1 = 'A';
        char e2 = e1;

        System.out.println("----------------------------------\n");



    }
}
