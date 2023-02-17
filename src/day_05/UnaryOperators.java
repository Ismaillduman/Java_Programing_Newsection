package day_05;

public class UnaryOperators {
    public static void main(String[] args) {
        //pre increment/decrement
        int x= 10;
        System.out.println(++x);
        System.out.println(--x);
        int y=100;
        System.out.println(--y);
        System.out.println(y);

        int b=25;
        System.out.println(b++);
        System.out.println(b--);
        System.out.println(++b);

        /*
        * Java führt immer erste Ausdruck und dann gefolgt von anderen Ausdruck.

Zb. Int a=25; ++a —> Zuerst erhöht die Zahl um 1 dann ausführt die code (pre increment)

    Int a= 25;  a++ —> zuerst liest die Nummer und dann erhöht die Nummer ,
*  aber kann ich nicht in der Konsole sehen.
*  Nächste Schritt ich kann dies in der Konsole sehen. (post increment)*/

        System.out.println("--------------------------------------------------");
        int n= 30;

        int m = n++;
          // m= n;


        System.out.println("m = " + m);; // 30
        System.out.println("n = " + n);; // 31
        //System.out.println(m=n);// 31
        System.out.println("m = " + m);; // 30

        System.out.println("-----------------------------------------------");


    }
}
