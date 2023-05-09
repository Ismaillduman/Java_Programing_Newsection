package daily_lessons.day_37_exceptions;

public class TestPizzaObj {
    public static void main(String[] args) {
        Pizza pizza1= new Pizza('M',5,4);
        Pizza pizza2= new Pizza('l',2,4);
        Pizza pizza3= new Pizza('M',5,4);
        System.out.println(pizza1.equals(pizza3)); //true but pizza1==pizza3 (reference address) is false
        //System.out.println(pizza1.equals("Pizza" )); // "Pizza" is here String obj so that is invalid obj type to compare

        //Pizza pizza= (Pizza) new Object(); // super class(parent) assigned to sub(child) class with down casting
        // we use the down casting to reach child class special fields
        Object obj=new Pizza('M',5,4);

        boolean r= obj.equals(pizza3);
        System.out.println(r);

        double total= ((Pizza)obj).calCost();

        System.out.println(total);
    }
}
