package office_hours.week_12.candy;

public class Candy {
    private String brand,make;
    private int quantity;
    private boolean isContainsPeanuts;

    public static int numOfTotalCandyInTheWorld;
    public static String countryLargestCandyConsumption;
    static {
        numOfTotalCandyInTheWorld=500_000;
        countryLargestCandyConsumption="USA";
    }

    public Candy(String brand, int quantity, boolean isContainsPeanuts) {
        this.brand = brand;
        this.make=getClass().getSimpleName();
        this.quantity = quantity;
        this.isContainsPeanuts = isContainsPeanuts;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isContainsPeanuts() {
        return isContainsPeanuts;
    }

    public void setContainsPeanuts(boolean containsPeanuts) {
        isContainsPeanuts = containsPeanuts;
    }

    public static int getNumOfTotalCandyInTheWorld() {
        return numOfTotalCandyInTheWorld;
    }



    public static String getCountryLargestCandyConsumption() {
        return countryLargestCandyConsumption;
    }



    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", make='" + make + '\'' +
                ", quantity=" + quantity +
                ", isContainsPeanuts=" + isContainsPeanuts +
                '}';
    }

    /*Create a class Candy

        declare these instance variables:
            - brand (String), quantity (int), contains peanuts (boolean)
                make brand and contains peanuts

        declare a static variables:
            - number of total candy in the world: 500,000
            - country with largest candy consumption: United States

        create a constructor to set all instance variables

        override toString

    Create a class Take5
        inherits Candy class
        make Take5

        create a constructor that calls the parent constructor

    Create a class Twix
        inherits Candy class
        make Twix

        create a constructor that calls the parent constructor

    Create a class HersheyBar
        inherits Candy class

        create a constructor that calls the parent constructor

    Create a class HersheyKiss
        inherits HersheyBar

        create a constructor that calls the parent constructor

    Create a class CandyFactory
    create a method method
    create the Candy objects to test all the information*/
}
