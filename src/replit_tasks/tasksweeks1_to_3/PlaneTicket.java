package replit_tasks.tasksweeks1_to_3;

public class PlaneTicket {
    /*city 1 -> Chicago
	city 2 -> Virginia
	base ticket price -> 110.50
	miles between cities -> 739.8
  rate: 10

  Output:
    The ticket price from Chicago to Virginia is $184.48*/
    public static void main(String[] args) {
        String cityOne = "Chicago";
        String cityTwo = "Virginia";
        double basePrice = 152.40;
        double milesBetweenCities = 739.8;
        double rate = 3;
        double price=basePrice+ milesBetweenCities/rate;

        System.out.println("The ticket price from "+cityOne+" to "
        + cityTwo+ " is $"+ price);
    }



}
