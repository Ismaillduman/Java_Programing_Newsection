package day_27_access_modifiers;

public class InstanceBlock {

    {
        System.out.println("Instance block");
    }
    public InstanceBlock() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        new InstanceBlock();
        new InstanceBlock();
        new InstanceBlock();
    }
}
