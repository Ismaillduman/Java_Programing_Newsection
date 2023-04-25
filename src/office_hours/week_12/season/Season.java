package office_hours.week_12.season;

public class Season {
    private String name;
    private int highestAverageTemp;
    private int lowestAverageTemp;

    public Season( int highestAverageTemp, int lowestAverageTemp) {
        this.name = getClass().getSimpleName();
        this.highestAverageTemp = highestAverageTemp;
        this.lowestAverageTemp = lowestAverageTemp;
    }
    public void activity(){

    }

    public String getName() {
        return name;
    }



    public int getHighestAverageTemp() {
        return highestAverageTemp;
    }

    public void setHighestAverageTemp(int highestAverageTemp) {
        this.highestAverageTemp = highestAverageTemp;
    }

    public int getLowestAverageTemp() {
        return lowestAverageTemp;
    }

    public void setLowestAverageTemp(int lowestAverageTemp) {
        this.lowestAverageTemp = lowestAverageTemp;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", highestAverageTemp=" + highestAverageTemp +
                ", lowestAverageTemp=" + lowestAverageTemp +
                '}';
    }
    /*Create a class Season

        instance variables
            - name
            - highest average temperature
            - lowest average temperature

        constructor:
            - initialize all fields

        methods:
            - activity(), toString()
            override activity in sub classes

    Create a class Winter
        child class of Season

        constructor: set values to variables

        methods:
            activity(): Print Use Fireplace

    Create a class Summer
        child class of Season

        constructor: set values to variables

        methods:
            activity(): Drink Lemonade

    Create a class Fall
        child class of Season

        constructor: set values to variables

        methods:
            activity(): Read A Book

    Create a class Spring
        child class of Season

        constructor: set values to variables

        methods:
            activity(): Go Outside

    Create a class CheckSeason

        create an object of Winter, Summer, Fall and Spring and verify if the constructor,
        toString(), and activity() are working properly for each class
*/
}
