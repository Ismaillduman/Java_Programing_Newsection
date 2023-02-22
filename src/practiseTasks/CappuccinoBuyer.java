package practiseTasks;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String result="",size="tall";
        double price;
        int calorie;

        switch(size){
            case "tall":
                price=3.69;
                calorie=90;
                result="price is $"+price+"; \n"+calorie+" calories";
                break;
            case "grande":
                price=3.99;
                calorie=120;
                result="price is $"+price+"; \n"+calorie+" calories";
                break;
            case "venti":
                price=4.29;
                calorie=150;
                result="price is $"+price+"; \n"+calorie+" calories";
                break;
            default:
                result="Invalid Size";
        }
        System.out.println(result);
    }
}
