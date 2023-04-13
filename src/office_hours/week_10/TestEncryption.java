package office_hours.week_10;

public class TestEncryption {
    public static void main(String[] args) {
        Encryption encryption= new Encryption("Ismail Duman",10,3);
        System.out.println(encryption);
        System.out.println(Encryption.decrypt("249 375 357 321 345 354 126 234 381 357 321 360", 10, 3));

    }
}
