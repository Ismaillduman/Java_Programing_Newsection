package reviews.review_06;

public class AddressClass {
    String street;
    int zipCode;
    String country;
    String city;
    String state;

    public AddressClass(String street, int zipCode, String country, String city, String state) {
        this.street = street;
        this.zipCode = zipCode;
        this.country = country;
        this.city = city;
        this.state = state;
    }

    public AddressClass() {

    }

    @Override
    public String toString() {
        return "AddressClass{" +
                "street='" + street + '\'' +
                ", zipCode=" + zipCode +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public void setInfo(String street,int zipCode,String country,String city,String state) {
        this.street = street;
        this.state = state;
        this.city = city;
        this.country = country;
        this.zipCode=zipCode;
    }


}
