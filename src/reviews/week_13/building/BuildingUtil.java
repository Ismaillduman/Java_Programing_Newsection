package reviews.week_13.building;

public class BuildingUtil {
    public static double rent(Building building){
if(building instanceof House){
    return building.price/360*2;
} else if (building instanceof OfficeBuilding) {
    return building.price/1000;
}
return -1; //if not any of them
    }
}
