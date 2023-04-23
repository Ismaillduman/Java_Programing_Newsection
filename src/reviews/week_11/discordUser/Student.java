package reviews.week_11.discordUser;

public class Student extends DiscordUser {

    int loverJava;

    public Student(String role, String name, int id, int loverJava) {
        super("Student", name, id);
        this.loverJava = loverJava;

    }


    public void sendingMessage(String name) {
        System.out.println("Sending message to "+name);
    }
    public  static void launch(){
        System.out.println("Student opening");
    }

    /*   /*
        - Student class inherits DiscordUser class

        - create constructor to call parent constructor and set up variables (role - Student, name, id)

        - overload the sendMessage(String name) to accept a String for the chat name
            print Sending message to $name
     */

}
