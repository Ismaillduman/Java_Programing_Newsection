package reviews.week_09;

public class Drink {
    public  String  name;
    public  double price;
    public  int quantity;

    public Drink(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    public String toString() {
        return name+" - "+price+" - "+quantity;
    }
}
