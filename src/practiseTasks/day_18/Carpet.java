package practiseTasks.day_18;

import java.text.DecimalFormat;

public class Carpet {
    /*Create a class named Carpet:
	 		Attributes:
                width
                length
                unitPrice
                isPersian


            Actions:
        		setInfo(): sets all the fields
                calcCost(): should be able to calculate the total cost of the carpet and return it as double
                toString(): should be able to display all the info of the carpet including the total cost of the
                 carpet as calculated by calcCost()


		    total price of carpet = (width*length) * unit-price

		    if the carpet is Persian  carpet, add 200$ to the totalPrice*/

    public int width,
            length;
    double unitPrice;

    public boolean isPersian;

    public void setInfo(int width, int length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost() {

        double totalCoast=width * length * unitPrice;
        if(isPersian){

           totalCoast+=200;
        }
       return totalCoast;
    }


    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", Total Cost =" + df.format(calcCost() )+
                '}';
    }
}
