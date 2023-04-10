package day_27_access_modifiers;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //new StaticInitializationBlock();
        System.out.println(StaticInitializationBlock.a);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);

        System.out.println("----------------------------------------------------");
        System.out.println(AccessModifier.publicData);//public ist in derselben paket zugänglich
        System.out.println(AccessModifier.protectedData);//public ist in derselben paket zugänglich
        System.out.println(AccessModifier.defaultData);//default ist in derselben Klasse zugänglich
        //System.out.println(AccessModifier.privateData);//private ist nicht in derselben paket zugänglich. unmöglich
        AccessModifier.protectedMethod();
        //AccessModifier.privateMethod();//private ist nicht in derselben paket zugänglich. unmöglich
        AccessModifier.publicMethod();
        AccessModifier.defaultMethod();
    }
}
