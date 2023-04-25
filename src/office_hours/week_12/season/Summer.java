package office_hours.week_12.season;

public class Summer extends Season{
    public Summer( int highestAverageTemp, int lowestAverageTemp) {
        super( highestAverageTemp, lowestAverageTemp);
    }

    @Override
    public void activity() {
        System.out.println("Drink Lemonade");
    }

    @Override
    public String toString() {
        return super.toString();
    }
    /*Create a class Summer
        child class of Season

        constructor: set values to variables

        methods:
            activity(): Drink Lemonade

    */
}
