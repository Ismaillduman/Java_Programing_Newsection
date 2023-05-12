package office_hours.week_14.shopping;

public final class Target extends Shopping implements Shipping {
    @Override
    public void shipItem() {
        System.out.println("Dell xps 15 is shipping");
    }

    @Override
    protected void buyItem() {
        System.out.println("Dell xps 15 is shopping");
    }

    @Override
    protected void returnItem() {
        System.out.println("return Dell xps 15");
    }/* - Make the class final
        - Inherit Shopping and implement Shipping
        - implement all abstract methods*/

}
