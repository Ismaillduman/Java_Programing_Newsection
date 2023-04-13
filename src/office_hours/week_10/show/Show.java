package office_hours.week_10.show;

import java.util.ArrayList;

public class Show {
    public String name;
    public int numberSeason;
    public boolean isCompleted;
    public ArrayList<String> audioLanguagesAvailable= new ArrayList<>();

    public Show(String name, int numberSeason, boolean isCompleted) {
        this.name = name;
        this.numberSeason = numberSeason;
        this.isCompleted = isCompleted;
    }

    public Show(String name, int numberSeason, boolean isCompleted, ArrayList<String> audioLanguagesAvailable) {
       this(name,numberSeason,isCompleted);
        this.audioLanguagesAvailable .addAll(audioLanguagesAvailable);
    }

    @Override
    public String toString() {
        return "Show{" +
                "name='" + name + '\'' +
                ", numberSeason=" + numberSeason +
                ", isCompleted=" + (isCompleted ? "finished":"ongoing") +
                ", audioLanguagesAvailable=" + audioLanguagesAvailable +
                '}';
    }
    /*


        define these instance variables
            name
            number seasons
            boolean completed
                true - finished
                false - ongoing
            audio languages available (String ArrayList)

    create a constructor that will initialize the name and number of seasons, completed
    create a constructor that will initialize the name, number of seasons, completed, & all the available languages

    create a toString*/

}
