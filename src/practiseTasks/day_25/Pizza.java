package practiseTasks.day_25;

public class Pizza {
    /*Create a custom class named Pizza:
        Attributes:
            size, numberOfCheeseTopping, numberOfPepperoniTopping

            Add a constructor that can set all the fields

        Actions:
            calcCost(): returns the totalCost of the pizza
            toString():returns a String containing the pizza size, quantity of each topping,
            and the pizza cost as calculated by calcCost()

        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping*/
    public int numberOfCheeseTopping,numberOfPepperoniTopping;
    public char size;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }
    public  int calcCost(){
        int costPizza=0;
        switch(size){
            case 'S': case's':
                costPizza+=10;
                break;
            case'M': case 'm':
                costPizza+=12;
                break;
            case 'L': case 'l':
                costPizza+=14;
                break;
            default:
                System.err.println("invalid size enter valid size S-M-L");
                break;

        }
        costPizza+=numberOfCheeseTopping*2;
        costPizza+=numberOfPepperoniTopping*2;
        return costPizza;
    }


    public String toString() {
        return "Pizza{" +
                "numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", size=" + size +
                ", cost of Pizza =" + calcCost() +
                '}';
    }
}
