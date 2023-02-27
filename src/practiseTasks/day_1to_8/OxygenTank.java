package practiseTasks.day_1to_8;

public class OxygenTank {
    public static void main(String[] args) {
        int level=40 ;
        String result;

        result= (level>50) ? " Be careful now you at at 50%" : (level>60) ? " Start to head back" : (level>70) ? "Don't go too far"
                : (level>80)? "Still okay" :(level>90) ? " Your tank is full": "Be Carefully";
        System.out.println("result = " + result);
    }
}
