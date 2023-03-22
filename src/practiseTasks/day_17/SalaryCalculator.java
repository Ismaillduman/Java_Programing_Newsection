package practiseTasks.day_17;

public class SalaryCalculator {

   public int  weeklyHours;
   public double  hourlyRate, stateTaxRate, federalTaxRate;

    public void setInfo(int weeklyHours, double hourlyRate, double stateTaxRate, double federalTaxRate) {
        this.weeklyHours = weeklyHours;
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate/100;
        this.federalTaxRate = federalTaxRate/100;
    }

    public double salaryBrut() {
       return hourlyRate * weeklyHours * 52;


    }

    /*salary(): calculates the salary ( hourlyRate * weeklyHour * 52) and returns it as double
            stateTax(): calculates the total state tax, and returns it as double
            federalTax(): calculates the total federal tax, and returns it as double
            salaryAfterTax(): calculates the salary after tax, and returns it as double*/

    public double stateTax() {
        return salaryBrut()*stateTaxRate;
    }

    public double federalTax() {
     return salaryBrut() * stateTaxRate;

    }

    public double salaryAfterTax() {

       return salaryBrut() - federalTax() - stateTax();

    }

    @Override
    public String toString() {
        return "SalaryCalculator{" +
                "salary before tax= $" + salaryBrut() +
                ", state Tax= $" + stateTax() +
                ", federal Tax= $" + federalTax() +
                ", salary after tax= $" + salaryAfterTax() +

                '}';
    }
}
