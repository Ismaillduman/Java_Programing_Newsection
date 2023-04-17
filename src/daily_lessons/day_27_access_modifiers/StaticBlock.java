package daily_lessons.day_27_access_modifiers;

public class StaticBlock {
    public StaticBlock(){
        System.out.println("constructor");
    }
   static {//static block wird immer zuerst ausgeführt. static initialization block
       System.out.println("Static block");
   }

    public static void main(String[] args) {
        System.out.println("main method");

        new StaticBlock();
        new StaticBlock();
        new StaticBlock();
    }
//    static {
//       System.out.println("Static block");
//  }
}
