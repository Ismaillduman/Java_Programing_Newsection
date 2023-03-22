package day_04_casting_concat;

public class ShippingAdress {
    public static void main(String[] args) {
        String name= "Ismail Duman";
        String buildingNumber= "256784l";
        String street= "Konrad Adenauer Str.";
        String city= "Munich";
        String state= "Bayern";
        String zipCode= "45789";

        System.out.println("Your shipping Address is: ");
        System.out.println("\t name = " + name);
        System.out.println("\t buildingNumber = " + buildingNumber);
        System.out.println("\t street = " + street);
        System.out.println("\t city = " + city);
        System.out.println("\t state = " + state);
        System.out.println("\t zipCode = " + zipCode);

        System.out.println("----------------------------------------------------");

        System.out.println("Your shipping Address is: \n\t" +
                name + "\n\t" + buildingNumber + "\n\t" + street +"\n\t"+city+"\n\t"
        +state+"\n\t"+zipCode);
    }
}
