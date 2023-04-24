package office_hours.week_11.country;

public class Test {
    public static void main(String[] args) {
        Country country= new Country("Cologne","Europa",0.8);
        System.out.println(Country.getWorldPopulation());
        System.out.println(Country.getPlanet());
        System.out.println(Country.getWorldCo2Level());
        System.out.println(country);

    }
}
