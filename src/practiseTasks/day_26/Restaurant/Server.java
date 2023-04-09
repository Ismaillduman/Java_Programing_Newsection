package practiseTasks.day_26.Restaurant;

import java.time.LocalDate;

public class Server {
    public String name;
    public int employeeId;
    public double hourlyRate;
    public  boolean isFullTime;
    public static String jobType;
    public LocalDate hire_date;

    public Server(String name, int employeeId, double hourlyRate, boolean isFullTime, LocalDate hire_date) {
        this.name = name;
        this.employeeId = employeeId;
        this.hourlyRate = hourlyRate;
        this.isFullTime = isFullTime;
        this.hire_date = hire_date;
    }
    public  void  takeOrder(){
        System.out.println(name+"\"is taking an order\"");
    }
    public  void cleanTable(){
        System.out.println(name+" is cleaning the table");
    }
    public String jobType(){
        if(isFullTime){
          jobType="Full time";
        }else{jobType="Part Time";}
        return jobType;
    }


    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", hourlyRate=" + hourlyRate +
                ", job type=" +jobType()+
                ", hire_date=" + hire_date +
                ", is Full time: " + isFullTime +
                ", hire_date=" + hire_date +
                '}';
    }

    public static void main(String[] args) {
        Server server= new Server("Ismail",1245,20,false,LocalDate.of(2023,10,15));
        System.out.println(server);
    }
    /*Restaurant Task:
		4.1  Create a class called Server

	        Attributes:
	                name (String), employeeID (int), hourlyRate (double), fullTime (boolean), hire_date (LocalDate)

			Add A constructor that can set all the fields

	        Actions: (all void methods)
	            takeOrder(): server's name + "is taking an order"
	            cleanTable(): server's name + "is cleaning the table"
	            toString(): Returns (String) all the information of a Server
	                -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"




		4.3 Create a class called Restaurant

	            Attributes:
	                Owner (String), Location (String), numberOfStars (int)
	                Servers (ArrayList of Server objects)
	                Chefs (ArrayList of Chef objects)

                Add a constructor that sets the owner, location, and number of stars.

	            Actions: (all void methods)

	                hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
	                hireServer(Server [] servers): accepts an array of Server objects and adds all of them to the Servers ArrayList

	                hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList

	                hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList

	                terminateChef(int employeeID): removes the chef with the matching ID from the arraylist of chef

	                terminateServer(int employeeID) removes the server with the matching ID from the arraylist of server

	                toString(): Return (String) of all the information of a Restaurant object. No need to print the whole list of Servers or Chefs. Print the number of Servers and Chefs along side the other information


		4.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information*/
}
