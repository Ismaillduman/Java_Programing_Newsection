package office_hours.week_14.shopping;

public final class Amazon extends OnlineShopping {
    @Override
    protected void viewCart() {
        System.out.println("Amazon shopping Chart");
    }

    @Override
    public void shipItem() {
        System.out.println("Products is shipping from Amazon");
    }

    @Override
    protected void buyItem() {
        System.out.println("Items bought");
    }

    @Override
    protected void returnItem() {
        System.out.println("Some items return to Amazon");
    }
    protected void amazonPrime(){
        System.out.println("Movies and music stream");
    }
    /*Create a concrete class Amazon
        - Make the class final
        - Inherit OnlineShopping and implement all abstract methods*/


}
