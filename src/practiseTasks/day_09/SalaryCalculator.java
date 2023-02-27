package practiseTasks.day_09;

import java.util.Scanner;

public class SalaryCalculator {
    /*Crreate a class named SalaryCalculator:
		- Ask the user to enter his/her hourlyRate
        - Ask the user how many hours he/she works in a week
        - Ask the user to enter state tax (in percentage)
        - Ask the user to enter federal tax (in percentage)

         -Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome*/
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" enter your hourlyRate");
        int hourlyRate=sc.nextInt();
        System.out.println("how many hours you work in a week");
        int workHour= sc.nextInt();
        System.out.println("enter state tax");
        double stateTaxPercentage=sc.nextDouble();
        System.out.println("enter federal tax");
        double federalTaxPercentage= sc.nextDouble();

        int grossSalary= hourlyRate*workHour*4;
        double stateTax= grossSalary*stateTaxPercentage/100;
        double federalTax= grossSalary*federalTaxPercentage/100;
        double totalTax= stateTax+federalTax;
        double netIncome= grossSalary-totalTax;

        System.out.println("netIncome = " + netIncome+ " gross salary= "+ grossSalary + " state tax= "+
                stateTax+" federal tax= "+federalTax+" total Tax= "+totalTax);
    }


}
