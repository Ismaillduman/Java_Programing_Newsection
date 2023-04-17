package utilities;
import daily_lessons.day_27_access_modifiers.AccessModifier;
import daily_lessons.day_27_access_modifiers.Data;

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

        System.out.println("----------------------------------------");
        System.out.println(AccessModifier.publicData); //public ist immer von anderen Paket  zugänglich
        //System.out.println(AccessModifier.protectedData); protected ist nicht immer von anderen paket  zugänglich,aber manchmal kann sein
        //System.out.println(AccessModifier.defaultdata); //default ist nicht von anderen paket zugänglich, unmöglich
       // System.out.println(AccessModifier.privateData);//private ist nicht von anderen paket zugänglich. unmöglich
AccessModifier.publicMethod();
//AccessModifier.protectedMethod();//protected ist nicht immer von anderen paket  zugänglich,aber manchmal kann sein
//AccessModifier.defaultMethod();//default ist nicht von anderen paket zugänglich, unmöglich
//AccessModifier.privateMethod();//private ist nicht von anderen paket zugänglich. unmöglich
    }
}
