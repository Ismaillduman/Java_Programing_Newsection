package office_hours.week_14.shopping;

public abstract class OnlineShopping extends Shopping implements Shipping {
    /*Inherit Shopping and implement Shipping
        - Does not need to implement any abstract methods
        - Declare an abstract methods:
            viewCart()*/
    protected abstract void viewCart();

}
