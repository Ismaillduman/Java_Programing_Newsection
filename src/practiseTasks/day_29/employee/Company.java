package practiseTasks.day_29.employee;

public class Company {


    public static void main(String[] args) {
        Developer developer= new Developer();
        developer.setInfo("john","asd1245","Developer","Java",35,55500,'M');
        developer.coding();
        developer.working();
        System.out.println(developer);
        Driver driver= new Driver();
        driver.setInfo("Carl","sdf125","taxi driver",45,25000,'M');
        System.out.println(driver);


    }
}
