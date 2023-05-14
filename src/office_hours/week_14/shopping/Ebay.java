package office_hours.week_14.shopping;

public class Ebay extends OnlineShopping implements AllowUsersToSell {
    @Override
    public void uploadProduct() {
        System.out.println("Some products upload to Ebay chart");
    }

    @Override
    protected void viewCart() {
        System.out.println("Show the Ebay chart");
    }

    @Override
    public void shipItem() {
        System.out.println("Products are shipping");
    }

    @Override
    protected void buyItem() {
        System.out.println("the product has been purchased");
    }

    @Override
    protected void returnItem() {
        System.out.println("product sent back");
    }
    /* Make the class final
        - Inherit OnlineShopping and implements interface AllowUsersToSell interface
        - Implement all abstract methods*/

}
