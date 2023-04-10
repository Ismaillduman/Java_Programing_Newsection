package day_27_access_modifiers;
//public->protected->default->private
public class AccessModifier {

    public static String publicData="public data";
    protected static String protectedData="protected data";
    private  static String privateData="private data";

    static String defaultData="Default data";

    public static void publicMethod(){
        System.out.println("public");
    }
    protected static void protectedMethod(){
        System.out.println("protected");
    }
    private static void privateMethod(){
        System.out.println("private");
    }
     static void defaultMethod(){
        System.out.println("default");
    }

    public static void main(String[] args) {
        System.out.println(publicData);//  public ist in derselben Klasse zugänglich
        System.out.println(protectedData);//protected ist in derselben Klasse zugänglich
        System.out.println(defaultData);//default ist in derselben Klasse zugänglich
        System.out.println(privateData);//private ist in derselben Klasse zugänglich. nur von dem derselbe klass ist zugänglich
        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();




    }
}
