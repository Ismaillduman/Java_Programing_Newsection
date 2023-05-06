package daily_lessons.day_36_polymorphism_continue;

import java.util.Arrays;

public class ApplePhone {
    private String brand, model, size, color;
    private double price;

    public ApplePhone(String model, String size, String color, double price) {

        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if( price <= 0){
            System.err.println("Invalid price: " + price);
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String[] colors = {"Black", "White", "Silver", "Gold", "Pink", "Blue", "Red", "Gray"};
        if( Arrays.asList(colors).contains(color) ) {
            this.color = color;
        }else{
            System.err.println("Invalid color: "+color+"\n color of the can only be : "+ Arrays.toString(colors));
            System.exit(1);
        }

    }

    public void call(long phoneNumber){
        System.out.println(getModel()+" is calling "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(getModel()+" is texting to "+phoneNumber);
    }


    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof ApplePhone)){
            System.err.println("Invalid obj, please enter Iphone");
            System.exit(1);
        }
        if(model.equals(((ApplePhone)obj).model)){
            return true;
        }
        return false;
    }
}
