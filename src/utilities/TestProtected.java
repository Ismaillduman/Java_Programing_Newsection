package utilities;

import daily_lessons.day_31.ProtectedAccessModifier;

public class TestProtected extends ProtectedAccessModifier{
    //we can access protected variable from super class , same class or same package
    public static void main(String[] args) {
        System.out.println(ProtectedAccessModifier.a);
    }
}
