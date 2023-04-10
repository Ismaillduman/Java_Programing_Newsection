package practiseTasks.day_27;

public class Iphone {
    /*Create a class named Iphone
            variables:
                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()*/
    public String model, color;
    public int price;
    public char size;
    public static String brand;
    public static boolean isSmartPhone;
    public static String oS, madeIn, designedIn;

    public Iphone(String model, String color, int price, char size) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.size = size;
    }

    static {
        brand = "Apple";
        madeIn = "China";
        designedIn = "USA";
        oS = "ios";
        isSmartPhone = true;

    }

    public static void printOperatingSystem() {
        System.out.println("operating system: " + oS);
    }

    public void call(long number) {

        System.out.println("Calling-> " + number);
    }

    public void text(long number) {
        System.out.println("Sending text to: " + number);
    }

    public void faceTime(long number) {
        System.out.println("call with face time with the number->" + number);
    }

    public void faceTime(String email) {
        System.out.println("write the mail with face time->" + email);
    }


    public String toString() {
        return "Iphone{" +
                "\nmodel='" + model + '\'' +
                ",\ncolor='" + color + '\'' +
                ", \nprice=" + price + '\'' +
                ", \nsize=" + size + '\'' +
                ", \nbrand=" + brand + '\'' +
                ", \nmade in=" + madeIn + '\'' +
                ", \ndesigned in=" + designedIn + '\'' +
                ",\noperating system=" + oS + '\'' +
                ",\n is smart phone=" + isSmartPhone +
                '}';
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone("pro 13", "black", 1080, 'L');
        System.out.println(iphone);
        iphone.call(1789896541);
        iphone.faceTime(1784568954);
        iphone.faceTime("hi teams");
        Iphone.printOperatingSystem();
    }
}