package day_05_operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int age= 21;
        String country="USA";

        boolean eligibleToVote= age>=18 && country=="USA"; // true && true == true when es  eine falsch gibt, die Ergebnise ist immer falsch

        // true && false --> false
        System.out.println("eligibleToVote = " + eligibleToVote);


        String answer="yes";
        boolean validAnswer= answer=="yes" || answer=="no"; // true || false == true, false || false -->false

        System.out.println(validAnswer);

        System.out.println("---------------------------------------------------");
        System.out.println(!true);
        String a = "yes";

        boolean yes= a=="yes";
        boolean no = !yes;
        System.out.println("yes = " + yes);
        System.out.println("no = " + no);

        System.out.println("-------------------------------------------");
        System.out.println(true ==! false&&false==!true&&true!=!true);






































    }
}
