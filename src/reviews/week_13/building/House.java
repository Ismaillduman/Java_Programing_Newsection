package reviews.week_13.building;

public class House extends Building implements HasBackyard{
   int numberOfResidents;

    public House(String location, double price, int numberOfResidents) {
        super(location, price);
        this.numberOfResidents = numberOfResidents;
    }

    @Override
    public void pay() {
        System.out.println("Paying  mortgage");
    }

    @Override
    public void mowLawn() {
        System.out.println("mowing the backyard");
    }

    @Override
    public String toString() {
        return super.toString()+" , number of residents "+numberOfResidents;
    }
}
