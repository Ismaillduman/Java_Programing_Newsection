package utilities;
import day_27_access_modifiers.Data;
import static day_27_access_modifiers.Data.*;
public class Test {
    public static void main(String[] args) {
        System.out.println(Data.e);
        System.out.println(Data.d);
        System.out.println(Data.e);

        Data.method3();
        Data.method4();

        Data obj= new Data();
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.a);

        obj.method1();
        obj.method2();
    }
}
