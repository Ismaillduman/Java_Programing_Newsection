package practiseTasks.day_25;

public class Carpet {
    /*Create a custom class named Carpet:
                instance variables:
                        width, length, unitPrice, isPersian (boolean)

                Add a constructor that can set all the fields

                instance methods:
                        calcCost(): should be able to caculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()

            total price of carpet = (width*length)*unitPrice;

            if the carpet is persian  carpet, add 200$ to the totalPrice
*/
    public double width,length;
    public int unitPrice;
    public boolean isPersian;

    public Carpet(double width, double length, int price, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = price;
        this.isPersian = isPersian;
    }
    public double calcCarpetOfCost(){
        double salaryOfCarpet=(width*length)*unitPrice;
        if(isPersian){
            salaryOfCarpet+=200;
        }
        return salaryOfCarpet;
    }

    @Override
    public String toString() {
        return "Carped{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", salary of carpet=" + calcCarpetOfCost() +
                '}';
    }
}
