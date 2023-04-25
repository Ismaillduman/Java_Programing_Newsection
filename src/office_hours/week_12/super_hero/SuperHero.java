package office_hours.week_12.super_hero;

import java.util.ArrayList;
import java.util.Arrays;

public class SuperHero {
    private String make,heroName,realName,universe;

    public ArrayList<String> powers;

    public SuperHero(String heroName, String realName) {
        powers = new ArrayList<>();
        this.heroName = heroName;
        this.realName = realName;
        this.universe = getClass().getSimpleName();
        this.make=universe;

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public void addPower(String power){
        powers.add(power);
    }
    public void addPowers(String[] power){
        powers.addAll(Arrays.asList(power));
    }
public void protect(){
    System.out.println(heroName+" protecting");
}

    @Override
    public String toString() {
        return "SuperHero{" +

                "make='" + make + '\'' +
                "heroName='" + heroName + '\'' +
                ", realName='" + realName + '\'' +
                ", universe='" + universe + '\'' +
                ", powers=" + powers.toString() +
                '}';
    }
/*Create a class SuperHero

        declare these instance variables:
            super hero name, real name, universe, powers (ArrayList of String)
            make the universe

        create a constructor to initialize all the variables

        create an instance method:
            protect() - print $super_hero protecting

        override the toString method

    */
}
