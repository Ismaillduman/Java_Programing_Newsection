package daily_lessons.day_04_casting_concat;

public class FlightTicket {
    public static void main(String[] args) {

        String from = "Las Vegas";

        String to = "to";
        String country = "McLean";
        String unit = "is $";
        double price = 425.5;
        String TicketInfo = String.join(" ", from, to, country, unit);
        String fullTicketInfo = TicketInfo + 425.5;
        System.out.println("fullTicketInfo = " + fullTicketInfo);


    }
}