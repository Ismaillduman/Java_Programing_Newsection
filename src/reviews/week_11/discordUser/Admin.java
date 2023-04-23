package reviews.week_11.discordUser;

public class Admin extends DiscordUser {
    public Admin( String name, int id) {
        super("Admin", name, id);
    }
    public void createChannel(){
        System.out.println(name+" is creating a channel as a "+role);
    }

    @Override
    public void sendingMessage() {
        System.out.println("Sending announcement");
    }

    public void sendingMessage(String channel) {
        System.out.println("Sending announcement "+channel);
    }
    /*
        - Admin class inherits DiscordUser class

        - create constructor to call parent constructor and set up variables (role - Admin, name, id)

        - create method:
            createChannel()
                Example output: prints Creating new discord channel

        - override the sendMessage() to print: "Sending announcement"
     */

}
