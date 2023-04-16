package reviews.week_10.amazon;

public class UseAmazon {


    public static void main(String[] args) {
        AmazonAccount amazonAccount= new AmazonAccount();
        amazonAccount.setInfo("hey what's up","Jenny",true);
        System.out.println(amazonAccount);
        amazonAccount.setUserName("Kevin");
        amazonAccount.setHasPrime(false);
        amazonAccount.setEmail("Hexen hexen");
        System.out.println(amazonAccount);
    }
}
