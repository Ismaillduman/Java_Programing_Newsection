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
        if(brand==null){
            System.err.println("brand can not be null");
            System.exit(1);
        }
        return brand;
    }

    public void setBrand(String brand) {
        if(brand.isEmpty()||brand.isBlank()){
            System.err.println("brand can not be null/empty/blank");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        if(model==null){
            System.err.println("model can not be null");
            System.exit(1);
        }
        return model;
    }

    public void setModel(String model) {
        if(model.isEmpty()||model.isBlank()){
            System.err.println("model can not be null/empty/blank");
            System.exit(1);
        }
        this.model = model;
    }

    public String getColor() {
        if(color==null){
            System.err.println("color can not be null");
            System.exit(1);
        }
        return color;
    }

    public void setColor(String color) {
        if(model.isEmpty()||model.isBlank()){
            System.err.println("color can not be null/empty/blank");
            System.exit(1);
        }
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
        if(price<0){
            System.err.println("price is not be negative: "+price);
            System.exit(1);
        }
        this.price = price;
    }
public void call(long phoneNumber){
    System.out.println(brand+phoneNumber+" is calling");
}
public void text(long phoneNumber){
    System.out.println(brand+phoneNumber+" is writing");
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
