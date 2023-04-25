package office_hours.week_12.super_hero;

public class DC extends SuperHero{
    private String city;

    public DC(String heroName, String realName, String universe, String make, String city) {
        super(heroName, realName, universe, make);
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public void protect() {
        System.out.println("super_hero protecting with honor");
    }
    /*Create a class DC
        inherits SuperHero
        make DC

        declare an instance variable: city

        create a constructor to initialize all the variables by calling the super class constructor
            set universe to "DC"

        override the protect method()
            print: super_hero protecting with honor*/
}
