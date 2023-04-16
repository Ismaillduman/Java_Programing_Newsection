package reviews.week_10.trafficLight;

public class TrafficLight {
    /*
    TrafficLight [Encapsulation]

    Create a class Traffic Light

    instance variable: color (String)

    the constructor should called the setter method

    encapsulate the class
        in the setter: only set the color if it is green, red, or yellow

     */
    private String color;

    public TrafficLight(String color) {
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {


        if (color.equalsIgnoreCase("green") || color.equalsIgnoreCase("red") || color.equalsIgnoreCase("yellow")) {
            this.color = color;
        }else{
            System.out.println("invalid color: "+color);
            System.exit(-1);
        }

    }


}
