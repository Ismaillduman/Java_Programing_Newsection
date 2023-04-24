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

    public static String getPlanet() {
        return planet;
    }

    public static void setPlanet(String planet) {
        Country.planet = planet;
    }

    public static double getWorldPopulation() {
        return worldPopulation;
    }

    public static void setWorldPopulation(double worldPopulation) {
        Country.worldPopulation = worldPopulation;
    }

    public static double getWorldCo2Level() {
        return worldCo2Level;
    }

    public static void setWorldCo2Level(double worldCo2Level) {
        Country.worldCo2Level = worldCo2Level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
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
