package practiseTasks.day_25;

public class SalaryCalculator {
    /* Create a custom class named SalaryCalculator:
        1.1 Create a class named Salary calculator:
                Attributes:
                    hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

                Add a constructor to set all the fields

                Actions:
                    salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
                    stateTax(): calculates the total state tax
                    federalTax(): calculates the total federal tax
                    salaryAfterTax(): calculates the salary after tax
                    toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object*/
    int weeklyHour,stateTaxRate,federalTaxRate;
    double hourlyRate;

    public SalaryCalculator(int weeklyHours, int stateTaxRate, int federalTaxRate, double hourlyRate) {
        this.weeklyHour = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.hourlyRate = hourlyRate;
    }
     public double calcSalary(){
         return hourlyRate * weeklyHour * 52;
     }
     public double calcStateTax(){
         return calcSalary()*stateTaxRate/100;
     }
     public double calcFederalTax(){
        return calcSalary()*federalTaxRate/100;
     }
    public double salaryAfterTax(){
        return calcSalary()-calcStateTax()-calcFederalTax();
    }

    @Override
    public String toString() {
        return "SalaryCalculator{" +
                "weeklyHour=" + weeklyHour +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", hourlyRate=" + hourlyRate +
                ", salary=" + calcSalary() +
                ", state tax=" + calcStateTax() +
                ", federal tax=" + calcFederalTax() +
                ", salary After tax=" + salaryAfterTax() +
                '}';
    }
}
