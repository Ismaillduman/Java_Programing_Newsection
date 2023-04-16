package daily_lessons.day_27_access_modifiers;

public class InstanceInitializationBlock {
    public String  name;
    public  int age;
    {
    name="James"; //wenn ich die instance Variables default Wert als was ich möchte erstellen, ich kann initialization block verwenden
    age=20;
    }

    public InstanceInitializationBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
//        InstanceInitializationBlock obj1= new InstanceInitializationBlock();
//        InstanceInitializationBlock obj2= new InstanceInitializationBlock();
//        System.out.println(obj1.name);
//        System.out.println(obj2.name);
        InstanceInitializationBlock obj1= new InstanceInitializationBlock("james",56);
        InstanceInitializationBlock obj2= new InstanceInitializationBlock("harry",16);
        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}
