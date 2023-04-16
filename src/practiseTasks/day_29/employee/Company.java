package practiseTasks.day_29.employee;

public class Company {


    public static void main(String[] args) {
        Developer developer= new Developer();
        developer.setInfo("john","asd1245","Developer","Java",35,55500,'M');
        developer.coding();
        developer.working();
        System.out.println(developer);
    }
}
