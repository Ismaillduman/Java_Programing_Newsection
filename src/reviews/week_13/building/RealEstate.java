package reviews.week_13.building;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RealEstate {
    public static void main(String[] args) {
        List<Building> buildings = new ArrayList<>();

        House house = new House("Los Angles", 450000, 6);
        house.pay();
        house.mowLawn();
        System.out.println(house.numberOfResidents);
        Building house2 = new House("Miami", 960000, 8);
        house2.pay();
        ((House) house2).mowLawn();
        System.out.println(((House) house2).numberOfResidents); //down casting
        OfficeBuilding office = new OfficeBuilding("Virginia", 180000, 1);

        buildings.addAll(Arrays.asList(house2, house, office,
                new House("Köln", 570000, 6),
                new OfficeBuilding("New York", 1500000, 3)));

        for (Building each : buildings) {
            System.out.println(BuildingUtil.rent(each));
        }
        System.out.println("===============================");
Building maxExpensiveBuilding=buildings.get(0);
        for (Building each : buildings) {
            if(each.price>maxExpensiveBuilding.price){
                maxExpensiveBuilding= each;
            }
        }
        System.out.println(maxExpensiveBuilding);


        ArrayList<Building> toFilter= new ArrayList<>(buildings);
  toFilter.removeIf(p->p.price>=1000000);
        System.out.println(toFilter);
    }
}
