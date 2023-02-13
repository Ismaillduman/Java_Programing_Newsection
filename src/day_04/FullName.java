package day_04;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Busra";
        String lasName = "Duman";

        String fullName = String.join(" ", firstName, lasName);
        System.out.println("fullName = " + fullName);
    }
}
