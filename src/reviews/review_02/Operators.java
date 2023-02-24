package reviews.review_02;

public class Operators {
    public static void main(String[] args) {
        int age= 10;
        age++;


        System.out.println("age = " + age); //11
        System.out.println("age = " + age++);//11
        System.out.println("age = " + age);//12


        int num=5;
        System.out.println(++num);//6
        System.out.println(num++);//6
        System.out.println(num);//7

        int x=15;
        int y= x++;
        System.out.println("x = " + x); //16
        System.out.println("y = " + y); //15

        int z =90;
        int w= --z;

        System.out.println("w = " + w); //89
        System.out.println("z = " + z); // 89

        int a=3;
        int b=5;
        a++;
        int c= a+b;

        System.out.println("c = " + c);//9

        /*
        the same result
        * int a=3;
        int b=5;
        int c= ++a + b;
        * */



    }

}
