package office_hours.week_14.shopping;

public class Warehouse {
    /*create a main method and create Target, Amazon, & EBay object to test the methods
    also use different polymorphic references to check what is accessible*/
    public static void main(String[] args) {
        Target target = new Target();
        Amazon amazon= new Amazon();
        Ebay ebay= new Ebay();

        target.returnItem();
        amazon.returnItem();
        amazon.amazonPrime();
        ebay.returnItem();
        System.out.println("-------------------");
        OnlineShopping onlineShopping= new Amazon();
        onlineShopping.shipItem();
        ((Amazon)onlineShopping).amazonPrime();//(Down casting)


        onlineShopping= new Ebay();
        onlineShopping.shipItem();


    }
}
