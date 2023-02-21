package day_06;

public class NetIncomeCalc {
    public static void main(String[] args) {
       /*
Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax

*/

        double salary = 130000;
        double netIncome = 0.0;
        boolean isMarried = true;
        double taxRate = 0.0;

        if (salary <= 79000) {
            taxRate = 0.2;

        } else if (80000 <= salary && salary <= 99000) {
            taxRate = 0.25;
        } else if (100000 <= salary && salary <= 129000) {
            taxRate = 0.3;
        } else if (130000 <= salary) {
            taxRate = 0.35;

        }
        if (isMarried = true) {
            taxRate -= 0.05;

        }

        System.out.println("netIncome = salary-(salary * taxRate) = " + (netIncome = salary* (1- taxRate)));


    }
}
