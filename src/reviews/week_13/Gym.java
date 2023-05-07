package reviews.week_13;

public class Gym {
    public static void main(String[] args) {
        // Exercise exercise= new Exercise(); can not be able to create a obj from abstract class

        Running running= new Running();
        System.out.println(running.getCaloriesBurned(60));
        running.perform();

       //  Lifting lifting= new Lifting(); can not be able to create a obj from abstract class
        System.out.println("========================================");
        Bench bench= new Bench();
        System.out.println(bench.getCaloriesBurned(60));
        bench.rackWeight();
        bench.perform();
    }

}
