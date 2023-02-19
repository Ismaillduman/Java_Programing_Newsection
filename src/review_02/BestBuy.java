package review_02;

public class BestBuy {
    public static void main(String[] args) {

        int tvs= 50;
        System.out.println("some one comes in a buy a tv");
        --tvs; //tvs--;
        //tvs -=1; //tvs = tvs-1;
        System.out.println("number of tvs is now: "+tvs); //49
        System.out.println("person 2 comes and bought a tv");
        System.out.println("number of tvs is now: "+ --tvs);

        System.out.println("person 3 comes and put a tv in their cart");
        System.out.println("how many tvs are still in the store: "+tvs--);
        System.out.println("they left , how many left in this store "+tvs);





    }
}
