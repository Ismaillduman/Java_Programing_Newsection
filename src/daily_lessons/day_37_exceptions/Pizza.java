package daily_lessons.day_37_exceptions;

public class Pizza {
    private  char size;
    private int numberOfCheeseTopping,numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }
    public int calCost() {
        int cost = 0;
        switch (size) {
            case 's':
            case'S':
                cost = 10 + 2 * numberOfCheeseTopping + 2 * numberOfPepperoniTopping;
                break;
            case 'L':
            case 'l':
                cost = 14 + 2 * numberOfCheeseTopping + 2 * numberOfPepperoniTopping;
                break;
            case 'M':
            case 'm':
                cost = 12 + 2 * numberOfCheeseTopping + 2 * numberOfPepperoniTopping;
                break;
            default:
                System.out.println("Invalid size");
        }
        return cost;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price=" + calCost() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Pizza)){
            System.err.println("Invalid Obj"+ obj);
            System.exit(1);
        }
        Pizza pizza=(Pizza)obj;
        if(size == pizza.getSize()){
            return numberOfPepperoniTopping == ((Pizza) obj).numberOfPepperoniTopping;
        }
        return false;
    }
}
