package reviews.week_10.trafficLight;

public class UseTrafficLight {
    public static void main(String[] args) {

        TrafficLight light= new TrafficLight("red");
        System.out.println(light.getColor());
        light.setColor("green");
        System.out.println(light.getColor());
        System.out.println(new TrafficLight("hello").getColor());

    }
}
