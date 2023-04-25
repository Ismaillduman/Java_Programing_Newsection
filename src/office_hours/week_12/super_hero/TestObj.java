package office_hours.week_12.super_hero;

import java.util.ArrayList;
import java.util.Arrays;

public class TestObj {
    public static void main(String[] args) {

        Marvel marvel=new Marvel("ironman","stark" );
        marvel.addPower("Fly");
        marvel.addPower("Laser");
marvel.addPowers(new String[]{"Fly","Swim","Laser"});
        System.out.println(marvel);
    }
}
