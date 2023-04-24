package office_hours.week_11.foodCourse;

public class Fish extends Entree{
    private String fishType;

    public Fish(String name, double price, String soupName, String fishType) {
        super(name, price, soupName);
        this.fishType = fishType;
    }

    public String getFishType() {
        return fishType;
    }

    public void setFishType(String fishType) {
        this.fishType = fishType;
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }
}
