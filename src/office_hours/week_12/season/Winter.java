package office_hours.week_12.season;

public class Winter extends Season{
    public Winter( int highestAverageTemp, int lowestAverageTemp) {
        super( highestAverageTemp, lowestAverageTemp);
    }

    @Override
    public void activity() {
        System.out.println("Use Fireplace");
    }

    @Override
    public String toString() {
        return super.toString();
    }

/*Create a class Winter
        child class of Season

        constructor: set values to variables

        methods:
            activity(): Print Use Fireplace

    */
}
