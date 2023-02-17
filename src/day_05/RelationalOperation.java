package day_05;

public class RelationalOperation {
    public static void main(String[] args) {

        int b= 1000;
        int a = 200;
//relational operation gibt mir immer boolean variable
        System.out.println(" b ist großer als a " + (a<=b)); //true
        System.out.println("-------------------------------------");

        int score= 55;

        boolean passed= score>=60;

        System.out.println("passed = " + passed);

        System.out.println("------------------------------------------------------------");
        int age=21;

        boolean eligibleToBuyAlcohol= age>21;
        System.out.println("eligibleToBuyAlcohol = " + eligibleToBuyAlcohol);





    }
}
