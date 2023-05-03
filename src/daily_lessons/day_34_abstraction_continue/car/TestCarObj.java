package daily_lessons.day_34_abstraction_continue.car;

public class TestCarObj {
    public static void main(String[] args) {
        Honda honda = new Honda("civic", "green", 2017, 25000);
        Audi audi = new Audi("Q3", "Metallic Grey", 2019, 32000);
        Tesla tesla = new Tesla("ASDFGH", "Pink", 2025, 254);
        System.out.println(honda);
        System.out.println(tesla);
        System.out.println(audi);
        System.out.println("------------------------------------------------------------");
        tesla.start();
        honda.start();
        audi.start();
        System.out.println("-----------------------------------");
        tesla.stop();
        audi.stop();
        honda.stop();
        System.out.println("----------------------------");
        audi.autoPark();
        tesla.autopilot();
    }
}

