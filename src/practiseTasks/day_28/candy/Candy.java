package practiseTasks.day_28.candy;

public class Candy {
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        this.brand = brand;
        setQuantity(quantity);
        setPrice(price);
        this.hasPeanuts = hasPeanuts;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            System.err.println("quantity of candy can not be set to zero or negative");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public String getPrice() {

        if (price == 0) {
            return "free";
        } else {
            return String.valueOf(price);
        }

    }

    public void setPrice(double price) {
        if (price < 0) {
            System.err.println("price of candy can not be set to negative");
            System.exit(1);
        }
        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }
    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + getQuantity() +
                ", price=" + getPrice() +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}
