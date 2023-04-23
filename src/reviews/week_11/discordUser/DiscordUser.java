package reviews.week_11.discordUser;

import java.time.LocalDate;

public class DiscordUser {
    String role;
    String name;
    int id;
    LocalDate createdDate;

    public DiscordUser(String role,String name,int id){
        this.role=role;
        this.name=name;
        this.id=id;
        createdDate=LocalDate.now();
    }

    public void sendingMessage(){
        System.out.println("Sending message to class chat");
    }
    public  void joinDiscord(String discordUrl){
        System.out.println("joining " + discordUrl);
    }

    @Override
    public String toString() {
        return "DiscordUser{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", createdDate=" + createdDate +
                '}';
    }
}
