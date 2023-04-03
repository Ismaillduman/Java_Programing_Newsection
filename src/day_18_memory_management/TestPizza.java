package day_18_memory_management;

public class TestPizza {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.setInfo("M",2,3);
        System.out.println(pizza);


        System.out.println("000000000000000000000000000000000000000000000");
        double total = 0;

        for (int i = 0; i < 20; i++) {

            Pizza small = new Pizza();
            small.setInfo("S", 2, 2);
            total += small.calCost();

            Pizza medium = new Pizza();
            medium.setInfo("M", 3, 4);
            total += medium.calCost();

            Pizza large = new Pizza();
            large.setInfo("L", 4, 5);
            total += large.calCost();

        }


        System.out.println("total = " + total);
    }
}
