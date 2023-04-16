package practiseTasks.day_29.phone;

public class Phone {

    private String brand,model,color;
    private char size;
    private int price;

    public void setInfo(String brand, String model, String color, char size, int price) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setSize(size);

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public String toString() {
        return getClass().getSimpleName() +
                " brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
