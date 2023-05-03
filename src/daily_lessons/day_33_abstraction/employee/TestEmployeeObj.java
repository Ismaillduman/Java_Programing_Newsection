package daily_lessons.day_33_abstraction.employee;

public class TestEmployeeObj {
    public static void main(String[] args) {
        // Employee employee= new Employee(); can not be able to create a obj from an abstract class

        Teacher teacher = new Teacher("Carol", 25, 'F', "asff564", "Chemistry", 45000);

        Developer developer = new Developer("Henry", 45, 'M', "wert4578", "Dev", 56000, "Typescript");

        Tester tester = new Tester("Betty", 32, 'F', "wet45", "SDET", 55000);

        Driver driver = new Driver("Carl", 47, 'M', "jklfd789", "Truck Driver", 48000);
        System.out.println(teacher);
        System.out.println(driver);
        System.out.println(developer);
        System.out.println(tester);
        System.out.println("----------------------------------------------------------");
        teacher.work();
        tester.work();
        driver.work();
        developer.work();

    }
}
