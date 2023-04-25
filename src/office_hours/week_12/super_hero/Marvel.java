package office_hours.week_12.super_hero;

import java.util.ArrayList;

public class Marvel extends SuperHero {
    public Marvel(String heroName, String realName) {
        super(heroName, realName, "Marvel", "Marvel");
    }

    public void callAvengers(){
        System.out.println("Calling all avengers");
    }

    @Override
    public void protect() {
        System.out.println(getHeroName()+" protecting by any means necessary");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    /*Create a class Marvel
        inherits SuperHero
        make Marvel

        create a constructor to initialize all the variables by calling the super class constructor
            set universe to "Marvel"

        create a method callAvengers()
            print: Calling all avengers

        override the protect method()
            print: super_hero protecting by any means necessary

    Create a class DC
        inherits SuperHero
        make DC

        declare an instance variable: city

        create a constructor to initialize all the variables by calling the super class constructor
            set universe to "DC"

        override the protect method()
            print: super_hero protecting with honor

    Create a class CheckHeros
    create a main method
    create Marvel and DC objects and test the variables and methods

    data:
    spider man, peter parker, Marvel, powers: Enhanced strength, agility, and spider-sense
    iron man, tony stark, Marvel, powers: powered suit of armor, flight, enhanced strength
    thor, thor odinson, Marvel, powers: wields hammer, controls lightning, flight
    wonder woman, diana prince, DC, powers: Enhanced strength, speed, agility, durability
    batman, bruce wayne, DC, powers: master detective, martial arts, technical tools
    superman, clark kent, DC, powers: super strength, speed, invulnerability, flight*/
}
