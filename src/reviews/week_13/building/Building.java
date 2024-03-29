package reviews.week_13.building;

public abstract class Building {
    String location;
    double price;

    public Building(String location, double price) {
        this.location = location;
        this.price = price;
    }



    public abstract void pay();

    @Override
    public String toString() {
        return  location +
                ", cost $" + price;
    }
}
