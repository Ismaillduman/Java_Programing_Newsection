package day_03;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class EmployeeExm {
    public static void main(String[] args) {
        List<EmployeeInfo> employee = new ArrayList<>();

        employee.add(new EmployeeInfo("Ismail", 38 , "male", "bequalified",
                12345678, "qa Tester", 3000, true ) );

        System.out.println(employee);
    }
}
