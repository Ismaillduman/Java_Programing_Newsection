package office_hours.week_12.season;

public class Spring extends Season{
    public Spring( int highestAverageTemp, int lowestAverageTemp) {
        super( highestAverageTemp, lowestAverageTemp);
    }

    @Override
    public void activity() {
        System.out.println("Go Outside");
    }

    @Override
    public String toString() {
        return super.toString();
    }


/* Create a class Spring
        child class of Season

        constructor: set values to variables

        methods:
            activity(): Go Outside

   */
}
