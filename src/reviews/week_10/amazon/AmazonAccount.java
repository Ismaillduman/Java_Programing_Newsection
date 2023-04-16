package reviews.week_10.amazon;

public class AmazonAccount {

        private String email,userName;
        private boolean hasPrime;

    public void setInfo(String email, String userName, boolean hasPrime) {
        this.email = email;
        this.userName = userName;
        this.hasPrime = hasPrime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isHasPrime() {
        return hasPrime;
    }

    public void setHasPrime(boolean hasPrime) {
        this.hasPrime = hasPrime;
    }


    public String toString() {
        return "AmazonAccount{" +
                "email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", hasPrime=" + hasPrime +
                '}';
    }
    /*



    encapsulate AmazonAccount

    methods: toString(), getters, setters

Create a class UseAmazon

    create an object of the AmazonAccount and verify the constructor,
    getters and setters and toString are working properly*/
}
