package replit_tasks;
import java.util.*;
public class GiftCardExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, which item would you like?");
        String item = input.nextLine();

        String result = "";
        double priceItem= 0.0;
        int balance=100;

        switch(item){
            case "Blanket":
                priceItem=60.0;
                break;
            case "Charger":
                priceItem=5;
                break;
            case "Hat":
                priceItem=25;
                break;
            case "Headphones":
                priceItem=30;
                break;
            case "Laptop":
                priceItem=200;
                break;
            case "Pants":
                priceItem=50;
                break;
            case "Pillow":
                priceItem=40;
                break;
            case "Smartphone":
                priceItem=1000;
                break;
            case "Socks":
                priceItem=5;
                break;
            case "USB_cable":
                priceItem=10;
                break;
            default:
                result="Sorry, that is an invalid item";

        }

if(priceItem>balance){
    result="Sorry, not enough funds on your gift card";
}else if(priceItem!=0){
    balance-=priceItem;
    System.out.println("Thank you for your purchase!");
    result="Your current balance is: "+balance+"$";
}
        System.out.println(result);
    }
}
