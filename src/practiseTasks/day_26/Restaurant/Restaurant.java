package practiseTasks.day_26.Restaurant;

import java.security.PublicKey;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Restaurant {
    public  String owner,location;
    public int numberOfStars;
    public ArrayList<Server> servers= new ArrayList<>();
    public ArrayList<Chef> chefs= new ArrayList<>();

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;

    }
    public void hireServer(Server server){
        servers.add(server);
    }
    public void hireServer(Server[] server){
        this.servers.addAll(Arrays.asList(server));
    }
    public void hireChef(Chef chef){
        chefs.add(chef);
    }
    public void hireChef(Chef[] chef){
        this.chefs.addAll(Arrays.asList(chef));
    }
    public void terminateChef(int employeeID){
        chefs.removeIf(p->p.equals(employeeID));
    }
    public void terminateServer(int employeeID){
        servers.removeIf(p->p.equals(employeeID));
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", servers=" + servers.size() +
                ", chefs=" + chefs.size() +
                '}';
    }

    public static void main(String[] args) {
        Restaurant restaurant= new Restaurant("Ismail","Koln",5);
        Server server1= new Server("Busra",456,85,true, LocalDate.of(2023,04,8));
        Server server2= new Server("ismail",123,23,true, LocalDate.of(2020,5,4));
        Server server3= new Server("yusuf",789,63,false, LocalDate.of(2023,2,7));
     Server[] servers= {server1,server2,server3};

     restaurant.hireServer(servers);
     restaurant.hireServer(server1);
     restaurant.hireServer(server2);
     restaurant.hireServer(server3);

        System.out.println(Arrays.toString(servers));
        for (Server each : servers) {
            System.out.println(each);
        }

    }

    /*Create a class called Restaurant

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

	                toString(): Return (String) of all the information of a Restaurant object.
	                 No need to print the whole list of Servers or Chefs.
	                 Print the number of Servers and Chefs along side the other information

*/
}
