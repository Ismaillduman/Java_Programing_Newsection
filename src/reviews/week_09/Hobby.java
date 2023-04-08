package reviews.week_09;

public class Hobby {
    public String name;
    public  int annualCost;
    public  boolean isOutdoors;
    public  boolean requiresOthers;

    public Hobby(String name) {
        this.name = name;
    }

    public Hobby(String name, int annualCost) {
       this(name);
        this.annualCost = annualCost;
    }

    public Hobby(String name, int annualCost, boolean isOutdoors, boolean requiresOthers) {
        this(name, annualCost);
        this.isOutdoors = isOutdoors;
        this.requiresOthers = requiresOthers;
    }

    public void doIt(){
        System.out.println("Doing "+name+(isOutdoors? "outside":"inside"));
    }


    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", annualCost=" + annualCost +
                ", isOutdoors=" + isOutdoors +
                ", requiresOthers=" + requiresOthers +
                '}';
    }

}
