package practiseTasks.day_26.Restaurant;

import java.time.LocalDate;
import java.util.Arrays;

public class LocalRestaurant {
    public static void main(String[] args) {
        /*4.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set.
	        	Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set.
	            Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information*/
        Restaurant restaurant= new Restaurant("Ismail","Frankfurt",4);
        Server server1= new Server("Busra",123,25.2,false, LocalDate.of(2020,5,+6));
        Server server2= new Server("Yusuf",456,56,true, LocalDate.of(2023,5,+6));
        Server server3= new Server("Damla",789,32.2,false, LocalDate.of(2021,5,+6));
        Server server4= new Server("Zübeyde",987,80,true, LocalDate.of(2022,5,+6));
        Server[] arrayOfServers= {server1,server2,server3,server4};
        restaurant.servers.addAll(Arrays.asList(arrayOfServers));

        Chef chef1= new Chef("Robin",123,45,false);
        Chef chef2= new Chef("Alina",456,56,true);
        Chef chef3= new Chef("Rocky",321,74,true);
        Chef chef4= new Chef("Rasim",159,96,true);
        Chef chef5= new Chef("Karen",753,13,false);
        Chef[] arrayOfChefs={chef1,chef5,chef2,chef4,chef3};
        restaurant.chefs.addAll(Arrays.asList(arrayOfChefs));
    }
}
