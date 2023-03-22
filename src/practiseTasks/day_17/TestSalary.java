package practiseTasks.day_17;

public class TestSalary {
    public static void main(String[] args) {
        SalaryCalculator salary = new SalaryCalculator();

        salary.setInfo(45,25,2,7);

        System.out.println(salary.toString());
        System.out.println("salary.salaryAfterTax() = $" + salary.salaryAfterTax());
        System.out.println("state tax: $"+salary.stateTax());
    }
}
