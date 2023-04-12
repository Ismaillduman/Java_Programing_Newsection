package office_hours.week_10;

public class Encryption {
    public String message;
    public int modifyNumber;
    public int factorNum;

    public Encryption(String message) {
        this.message = message;
    }

    public Encryption(String message, int modifyNumber, int factorNum) {
        this(message);
        this.modifyNumber = modifyNumber;
        this.factorNum = factorNum;
        encrypt();
    }

    public void encrypt() {
        String encrypted = "";

        for (char each:message.toCharArray()) {
            encrypted+=(each+modifyNumber)*factorNum+" ";

        }
        message=encrypted.trim();
    }
    public static String decrypt(String message,int modifyNumber,int factorNum ){
        String[] eachPart=message.split(" ");
        String decrypted="";
        for (String each:eachPart) {
            decrypted+=(char)(Integer.parseInt(each)/factorNum-modifyNumber);

        }
        return decrypted;
    }


    public String toString() {
        return "Encryption{" +
                "message='" + message + '\'' +
                '}';
    }

}
