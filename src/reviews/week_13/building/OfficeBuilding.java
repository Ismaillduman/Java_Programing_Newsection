package reviews.week_13.building;

public class OfficeBuilding extends Building implements HasElevator {
    int numOfFloors;

    public OfficeBuilding(String location, double price, int numOfFloors) {
        super(location, price);
        this.numOfFloors = numOfFloors;
    }

    @Override
    public void pay() {
        System.out.println("paying lease");
    }

    @Override
    public void elevator(int floor) {
        System.out.println("going to floor "+floor);
    }

    @Override
    public String toString() {
        return super.toString()+ ", number of floors "+numOfFloors;
    }
}
