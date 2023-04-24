package office_hours.week_11.country;

public class Country {
    private static String planet;
    private static double worldPopulation;
    private static double worldCo2Level;
    static {
        planet="Earth";
        worldPopulation=7.88;
        worldCo2Level=417.83;

    }
private String name;
    private  String continent;
    private double population;

    public Country(String name, String continent, double population) {
        this.name = name;
        this.continent = continent;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", population=" + population +
                '}';
    }

    /*Country [static, instance, class, object]

    Create a class Country
    define these static variables:
        planet - Earth
        world population - 7.88 billion - represent as a double 7.88 -
        world co2 level - 417.83 - represent as a double - the unit is ppm (parts per million)

    define these instance variables:
         name, population, continent

    create a static block to initialize the static variables

    create a constructor to initialize the instance variables*/
}
