package practiseTasks.day_17;

public class Car {
    /*1. Create a custom class named Car
		Attributes:
			make, model, year, color, price

		Actions:
			setInfo(): sets all the fields of the car object
			toString(): when a car object is passed in print statement, it should display all the information of the car object
			start()*/
    String make;
    String model;
    int year;
    String color;
    int price;

   public void setInfo(String make, String model, int year, int price, String color){
       this.make=make;
       this.color=color;
       this.year=year;
       this.price=price;
       this.model=model;

   }



    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

public void start(){
    System.out.println(model +" start $"+price+" in this "+year);
}
}
