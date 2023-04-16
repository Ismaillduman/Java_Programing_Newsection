package reviews.week_10.bestBuy;

import java.text.DecimalFormat;

public class BestBuy {
    /*Create a class BestBuy

		define these instance variables:
			address, gross income, expenses

		define these static variables:
			ceo: Corie Barry
			hq: Richfield, Minnesota
			revenue: 51.76 billion

		create an instance method:
			reportProfits()
				use the income of the location and reduce the expenses.
				Add the result to the total revenue of all BestBuy stores

		create a class to run the code and create BestBuy objects*/

    private String address;
    private double grossIncome, expenses;

    private static String ceo;
    private static String hq;
    private static double revenue;

    public BestBuy(String address, double grossIncome, double expenses) {
        System.out.println("CONSTRUCTOR RUNNING");
        this.address = address;
        this.grossIncome = grossIncome;
        this.expenses = expenses;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGrossIncome() {
        return grossIncome;
    }

    public void setGrossIncome(double grossIncome) {
        this.grossIncome = grossIncome;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    public static String getCeo() {
        return ceo;
    }

    public static void setCeo(String ceo) {
        BestBuy.ceo = ceo;
    }

    public static String getHq() {
        return hq;
    }

    public static void setHq(String hq) {
        BestBuy.hq = hq;
    }

    public static double getRevenue() {
        return revenue;
    }

    public static void setRevenue(double revenue) {
        BestBuy.revenue = revenue;
    }

    static {
        ceo="Corie Barry";
        hq= "Richfield, Minnesota";
        revenue= 51.76;
    }
    {
        System.out.println("instance method running");
    }
    public String reportProfits(){
        DecimalFormat df= new DecimalFormat("0.00");
         df.format(revenue+=grossIncome-expenses);
         return "last revenue is "+df.format(revenue);

    }



    public String toString() {
        return "BestBuy{" +
                "address='" + address + '\'' +
                ", grossIncome=" + grossIncome +
                ", expenses=" + expenses +
                ", revenue= " + revenue +
                '}';
    }
}
