package daily_lessons.day_04_casting_concat;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Busra";
        String lasName = "Duman";

        String fullName = String.join(" ", firstName, lasName);
        System.out.println("fullName = " + fullName);
    }
}
