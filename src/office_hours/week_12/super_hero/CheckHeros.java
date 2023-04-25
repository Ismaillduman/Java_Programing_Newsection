package office_hours.week_12.super_hero;

public class CheckHeros {
    public static void main(String[] args) {
        DC dc= new DC("superman","clark","New York");
        dc.addPowers(new String []{"fly","laser","wind","velocity"});
        System.out.println(dc);
        dc.protect();
        /*Create a class CheckHeros
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
}
