package office_hours.week_11;

public class Workout {
    private String name;
    private int duration;
    private double caloriesBurned;

    public Workout(String name, int duration, double caloriesBurned) {
        setName(name);
        setDuration(duration);
        setCaloriesBurned(caloriesBurned);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //should have only letters and spaces, no other characters type. The name cannot be empty either
        if(name.isEmpty()){
            System.err.println("name can not be empty");
            return;
        }
        for (char each:name.toCharArray()) {
             if(!Character.isLetter(each)&&each!=' '){
                 System.err.println(name+ " is not valid");
                 System.exit(1);
             }

        }
//        boolean isValid=true;
//
//        for (char c : name.toCharArray()) {
//            if (!Character.isLetter(c) && c!=' ')
//                isValid=false;
//        }
//        if (!isValid){
//            System.err.println("Your name is not valid");
//            return;
//        }
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if(duration<=0){
            System.err.println("should be more than 0");
        }
        this.duration = duration;
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(double caloriesBurned) {
        if(caloriesBurned<=0||caloriesBurned>1000){
            System.err.println("should be more than 0 and less than 1000");
            System.exit(1);
        }
        this.caloriesBurned = caloriesBurned;
    }

    @Override
    public String toString() {
        return "Workout{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", caloriesBurned=" + caloriesBurned +
                '}';
    }

    /* define and encapsulate these instance variables:
        name, duration, calories burned

    create a constructor to initialize the variables. Call the setters in the constructor

    in the setters only set the values if they are valid data based on these requirements:
        name: should have only letters and spaces, no other characters type. The name cannot be empty either

        duration: should be more than 0

        calories burned: should be more than 0 and less than 1000

    create another class to test the Workout objects*/
}
