package reviews.week_11.access.a;

public class Computer {
    public String os;
    protected int memory;
    String brand;
    private  boolean hasWifi;


    public String toString() {
        return "Computer{" +
                "os='" + os + '\'' +
                ", memory=" + memory +
                ", brand='" + brand + '\'' +
                ", hasWifi=" + hasWifi +
                '}';
    }
}
