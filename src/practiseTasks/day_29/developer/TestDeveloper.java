package practiseTasks.day_29.developer;

public class TestDeveloper {
    public static void main(String[] args) {
        Developer developer= new Developer();
        developer.setInfo("carol","asf123","Developer","Java",35,45000,'F');
        System.out.println(developer);
        developer.coding();
    }
}
