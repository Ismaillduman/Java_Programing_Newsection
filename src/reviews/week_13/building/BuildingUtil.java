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

    public static Building search(String location){
        if(location.equals("New York")){
            return new House("New York",4500000,5);
        } else if (location.equals("Köln")) {
            return new House("Köln",100000,6);
        }else{
            return null;
        }
    }
}
