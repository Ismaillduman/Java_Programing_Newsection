package office_hours.week_11.foodCourse;

public class Entree extends FoodCourse{
    private String soupName;

    public String getSoupName() {
        return soupName;
    }

    public void setSoupName(String soupName) {
        this.soupName = soupName;
    }

    public Entree(String name, double price, String soupName) {
        super(name, price);
        this.soupName = soupName;
    }
}
