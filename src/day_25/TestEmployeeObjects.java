package day_25;

import java.time.LocalDate;

public class TestEmployeeObjects {
    public static void main(String[] args) {
        Employee employee1= new Employee("Ismail","sdet",39,50000,'M', LocalDate.of(2020,5,15));
        Employee employee2= new Employee("Busra","QA",11,55000,'F', LocalDate.of(2012,11,25));
        Employee employee3= new Employee("Yusuf","Dev",8,60000,'M', LocalDate.of(2015,5,12));
        Employee employee4= new Employee("Zübeyde","PO",41,80000,'F', LocalDate.of(2021,3,17));

        System.out.println(employee1);
        System.out.println(employee2);
    }
}
