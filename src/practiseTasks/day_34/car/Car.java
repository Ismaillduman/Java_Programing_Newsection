package practiseTasks.day_34.car;

public abstract class Car {
    private final String make,model;
    private final int year;
    private double price;
    private String color;

    public Car( String model, int year, double price, String color) {

        this.make = getClass().getSimpleName();
        if(model==null||model.isEmpty()){
            System.err.println("model can not be null");
            System.exit(1);
        }
        this.model = model;
        if(year<1886){
            System.err.println("Invalid year "+year);
            System.exit(1);
        }
        this.year = year;
        if(price<=0){
            System.err.println("Invalid price "+price);
            System.exit(1);
        }
        this.price = price;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        if(color==null||color.isEmpty()){
            System.err.println("color can not be null");
            System.exit(1);
        }
        this.color = color;
    }

    public abstract void start();
    public abstract void drive();
    public void stop(){
        System.out.println("stops when you apply the brake");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
/*Create an Abstract class named Car:
				Variables:
					make (final), model (final), year (final), price, color

				Encapsulate all the fields

				Add a constructor that can set all the fields

				Condition for setting the fields:
						1. make, model, color can not be null
						2. make, model, color can not be empty
						2. year can not be less than 1886
						2. price can not be negative

				abstract methods:
					start();
					drive();

				none abstract methods:
					stop()
					toString()

*/
}
