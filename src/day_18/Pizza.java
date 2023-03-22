package day_18;

public class Pizza {
    /* Create a class named Pizza:
			Attributes:
				1. size
				2. numberOfCheeseTopping
				3. numberOfPepperoniTopping

			Actions:
				calcCost(): returns the total cost of the pizza
				toString(): returns a String containing the pizza size, quantity of each topping,
				 and the pizza cost as calculated by calcCost()

		Pizza cost is determined by:
		                S: $10 + $2 per topping
		                M: $12 + $2 per topping
		                L: $14 + $2 per topping*/
    public String size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    public void setInfo(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }


    public int calCost() {
        int cost = 0;
        switch (size) {
            case "s":
            case "S":
                cost = 10 + 2 * numberOfCheeseTopping + 2 * numberOfPepperoniTopping;
                break;
            case "L":
            case "l":
                cost = 14 + 2 * numberOfCheeseTopping + 2 * numberOfPepperoniTopping;
                break;
            case "M":
            case "m":
                cost = 12 + 2 * numberOfCheeseTopping + 2 * numberOfPepperoniTopping;
                break;
            default:
                System.out.println("Invalid size");
        }
        return cost;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", pizza cost=" + calCost() +
                '}';
    }
}
