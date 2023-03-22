package practiseTasks.day_18;

public class TestContact {
    public static void main(String[] args) {
        Contact contact = new Contact();
        contact.setInfo("Ismail", 788391893,"ismailduman@gmail");
        contact.call();
        contact.sendEmail();
        contact.sendMessage();
    }
}
