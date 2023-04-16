package daily_lessons.day_17_class_object;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee= new Employee();
        employee.setInfo("Ismail",38,'M',"sdet",55000,"12052511");
        System.out.println(employee);
        employee.work();
    }
}
