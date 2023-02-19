package review_02;

public class ConcetenationAdditionCasting {
    public static void main(String[] args) {
        char n='a';
        char n2='f';
        int result=0;
        result = n + n2;
        System.out.println("result = " + result); //199


        System.out.println(5 + 3 +"Ismail");
        int a = 5;
        int b= 6;
        String name = "Busra";

        System.out.println(a +b+name); //11Busra string
        System.out.println(name+a+b); //Busra56  string
        System.out.println(name+(a+b)); //Busra11 string

        System.out.println("myname=\"" + 'i'+"\""+'s'+'m'+'a'+'i'+'l');


        System.out.print('i');
        System.out.print('s');
        System.out.print('m');
        System.out.print('a');
        System.out.print('i');
        System.out.print('l');

        System.out.println("------------------------------------");

        //CASTING IMPLICITLY (automatic --> smaller to bigger) AND EXPLICITLY (manuel --> bigger to smaller variable type)
        //convert from the primitive data type to another

        int d= 100;
        long l =a;

        long l2= 200l;
        byte b2 = (byte) l2;

        double d3= 15.99;
        int i2= (int) d3;

        System.out.println(i2);
        int i4= 1000000;
        byte b4= (byte) i4; //data loss problem
        System.out.println(b4); //64 the result base on some calculation

        float f5= (float) 15.25;
        System.out.println((double)f5); //15.25
        float f6=  15.25F;
        int i5= (int) f5;
        System.out.println((double)i5); //15.0
        char letter='a';
        System.out.println((int)letter);

        double d6= 12.99;
        long l7=(long)d6;
        System.out.println(l7); //12

        char letter2=66;
        System.out.println("letter2 = " + letter2); //B


    }
}
