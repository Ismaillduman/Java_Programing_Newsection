package office_hours.week_12.season;

public class Fall extends Season{
    public Fall( int highestAverageTemp, int lowestAverageTemp) {
        super( highestAverageTemp, lowestAverageTemp);
    }
    @Override
    public void activity(){
        System.out.println("Read a book");
    }
    @Override
    public String toString() {
        return super.toString();
    }
    /*Create a class Fall
        child class of Season

        constructor: set values to variables

        methods:
            activity(): Read A Book

   */
}
