package practiseTasks.day_29.tester;

public class TestTester {
    public static void main(String[] args) {
Tester tester= new Tester("Ismail","as123","SDET",25,55000,'M');
tester.setAge(39);
        System.out.println(tester.getAge());
        tester.setName("John");
        System.out.println(tester);
    }
}
