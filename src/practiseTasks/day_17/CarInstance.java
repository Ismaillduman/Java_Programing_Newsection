package practiseTasks.day_17;

public class CarInstance {
    public static void main(String[] args) {
        Car car = new Car();
        car.price = 5500;
        car.year = 2008;
        car.color = "Grey";
        car.make = "VW";
        car.model = "GOLF V";

        System.out.println(car);

        Car car_1 = new Car();
        car_1.setInfo("VW", "Golf 8", 2022, 15500, "Grey");
        System.out.println("car_1 = " + car_1);

        car_1.start();
    }


}
