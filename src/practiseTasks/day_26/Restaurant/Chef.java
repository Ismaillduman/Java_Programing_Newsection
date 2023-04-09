package practiseTasks.day_26.Restaurant;

public class Chef {
    public  String name;
    public  int employeeId;
    public  double hourlyRate;
    public  boolean isFullTime;
    public String jobType;

    public Chef(String name, int employeeId, double hourlyRate, boolean isFullTime) {
        this.name = name;
        this.employeeId = employeeId;
        this.hourlyRate = hourlyRate;
        this.isFullTime = isFullTime;
    }
    public  void  makeOrder(){
        System.out.println(name+ " is making an order");
    }
    public  void washDishes(){
        System.out.println(name+" is washing tje dishes");
    }


  public  String jobType(){
        if(isFullTime){
            jobType="Full time";
        }else{
        jobType="Part Time";
        }
        return jobType;
  }
    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", hourlyRate=" + hourlyRate +
                ", isFullTime=" + isFullTime +
                ", job type=" + jobType() +
                '}';
    }

    public static void main(String[] args) {
        Chef chef= new Chef("Ismail",1456,25.4,true);
        System.out.println(chef);
    }
    /*4.2 Create a class called Chef

		            Attributes:
		                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)

			   Add A constructor that can set all the fields

		            Actions: (all void methods)
		                makeOrder(): chef's name + "is making an order"
		                washDishes(): chef's name + "is washing the dishes"
		                toString(): Returns (String) all the information of a Chef
		                    -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"*/

}
