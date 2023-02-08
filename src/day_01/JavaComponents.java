package day_01;

import java.util.HashMap;

public class JavaComponents {

    public static void main(String[] args) {

        String[] javaComponents= {"JDK" , "JVM", "JRE"};

        for (int i = 0; i<javaComponents.length;i ++){

            System.out.println(javaComponents[i]);
        }
        for (String i: javaComponents
             ) {
            System.out.println(i);
        }
        System.out.println("1. "+"JDK");
        System.out.println("2. "+"JRE");
        System.out.println("3. "+"JVM");
    }
}
