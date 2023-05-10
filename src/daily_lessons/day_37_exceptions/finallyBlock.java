package daily_lessons.day_37_exceptions;

public class finallyBlock {
    public static void main(String[] args) {

        try {
            System.out.println(9/0);
        }catch (RuntimeException e){
            System.out.println("Run time exceptions caught");
            e.printStackTrace();
            //System.exit(1);
        }finally {
            System.out.println("Finally Block");
        }
    }
}
