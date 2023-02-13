package day_04;

public class SalaryCalculator {
    public static void main(String[] args) {
        /* Create a class named SalaryCalculator, and declare the following variables:
                hourlyRate
                weeklyHours
                stateTaxRate
                federalTaxRate

    7.1 Use the given info above to calculate the followings:
                salaryBeforeTax
                stateTax
                federalTax
                totalTax
                salaryAfterTax

    7.2 Display each of the above in the following format:
        Ex:
              hourlyRate = $50
              weeklyHours = 45
              stateTax = 6  (given as percentage)
              federalTax = 26 (given as percentage)

        output:
               Gross pay is: $117000
                    Federal tax is: $30420
                    State tax is: $7020
                    Total tax is: $37440
                     Net income is: $79560*/

        double hourlyRate, stateTaxRate, federalTaxRate, salaryBeforeTax,totalTax,salaryAfterTax;
        double weeklyHours,stateTax,federalTax;

        hourlyRate= 50.0;
        weeklyHours=45.0;
        stateTaxRate= (6.0/100);
        federalTaxRate=26d/100d;

        salaryBeforeTax= hourlyRate * weeklyHours * 52;
        stateTax= salaryBeforeTax*(stateTaxRate);
        federalTax= salaryBeforeTax*federalTaxRate;
        totalTax=stateTax+federalTax;
        salaryAfterTax=salaryBeforeTax-totalTax;

        System.out.println("Gross pay is: $"+salaryBeforeTax);
        System.out.println("Federal tax is: $"+federalTax);
        System.out.println("State tax is: $"+stateTax);
        System.out.println("Total tax is: $"+totalTax);
        System.out.println("Net income is: $" +salaryAfterTax);

        System.out.println("_-----------------------------------------");

        System.out.println("Gross pay is: $"+salaryBeforeTax+"\n"+"Federal tax is §"+federalTax+ "\n" +"State tax is: $"+stateTax+
                "\n"+"Total tax is: $"+totalTax + "\n" +"Net income is: $" +salaryAfterTax);




    }}
