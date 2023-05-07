package reviews.week_13;

public class Running extends Exercise {

    @Override
    public void perform() {
        System.out.println("Running");
    }

    @Override
    public int getCaloriesBurned(int minutes) {
        return minutes*15;
    }
}
