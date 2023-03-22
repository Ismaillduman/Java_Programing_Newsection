package reviews.review_06;

public class AddressExm {
    public static void main(String[] args) {
        AddressClass address = new AddressClass();

        address.city= "NRW";
        address.country="Erftstadt";
        address.state="NRW";
        address.zipCode=50375;
        address.street="humbolt";


        System.out.println(address.toString());


        AddressClass address2= new AddressClass();

        address2.setInfo("konrad",50374,"Hamburg","Heimland","NRW");
        System.out.println("address2 = " + address2);
    }


}
